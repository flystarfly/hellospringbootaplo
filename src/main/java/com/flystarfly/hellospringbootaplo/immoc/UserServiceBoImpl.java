package com.flystarfly.hellospringbootaplo.immoc;

import org.springframework.stereotype.Service;

/**
 * @author 002941
 * @description TODO
 * @date 2018/10/24 14:37
 * @since 1.0.0
 **/
@Service
public class UserServiceBoImpl implements  UserServiceBo{

    @Override
    public int add() {
        System.out.println("__________________add______________________");
        return 0;
    }
}
