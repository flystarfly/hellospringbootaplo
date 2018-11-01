package com.flystarfly.hellospringbootaplo.invocationHandlerPacs;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 002941
 * @description 使用 CGLIB 进行代理需要实现 MethodInterceptor，创建一个方法拦截器 CglibProxy 类
 * @date 2018/10/24 15:16
 * @since 1.0.0
 **/
public class CglibProxy implements MethodInterceptor {

    //(10)
    private Enhancer enhancer = new Enhancer();
    //(11)
    public Object getProxy(Class clazz) {
        //（12）设置被代理类的Class对象
        enhancer.setSuperclass(clazz);
        //(13)设置拦截器回调
        enhancer.setCallback( this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(obj.getClass().getName()+"."+method.getName());
        Object result = proxy.invokeSuper(obj, args);

        return result;
    }
}
