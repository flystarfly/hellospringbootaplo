package com.flystarfly.hellospringbootaplo.invocationHandlerPacs;

import com.flystarfly.hellospringbootaplo.immoc.UserServiceBo;
import com.flystarfly.hellospringbootaplo.immoc.UserServiceBoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 002941
 * @description  InvocationHandler 的实现类
 * @date 2018/10/24 14:43
 * @since 1.0.0
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target){
        super();
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //(1)
        System.out.println("-----------------begin "+method.getName()+"-----------------");
        //(2)
        Object result = method.invoke(target, args);
        //(3)
        System.out.println("-----------------end "+method.getName()+"-----------------");
        return result;
    }

    public Object getProxy(){
        //(4)
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }


    public static void main(String[] args) {

        //(5)打开这个开关，可以把生成的代理类保存到磁盘
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //(6)创建目标对象（被代理对象）
        UserServiceBo service = new UserServiceBoImpl();
        //(7)创建一个InvocationHandler实例，并传递被代理对象
        MyInvocationHandler handler = new MyInvocationHandler(service);
        //(8)生成代理类
        UserServiceBo proxy = (UserServiceBo) handler.getProxy();
        proxy.add();
    }
}
