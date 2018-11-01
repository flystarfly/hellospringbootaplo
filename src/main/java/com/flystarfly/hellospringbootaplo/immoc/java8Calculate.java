package com.flystarfly.hellospringbootaplo.immoc;

import java.util.stream.Stream;

/**
    *@Description TODO
    *@Author 002941
    *@Date 2018/10/24 10:49
    *@Version 1.0
**/
public class java8Calculate {


    
    /**
     * @Author 002941
     * @Description //TODO
     * @Date  2018/10/23 17:51
     * @Param [values]
     * @return java.lang.Integer
     **/
    public static Integer sum(Integer... values){
        int sum = Stream.of(values).reduce(0,Integer::sum);
        return sum;
    }

    /**
        *@Description TODO
        *@Author 002941
        *@Date 2018/10/24 10:58 
        *@Version 1.0
    **/
    public static void main(String[] args){
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
    }


}
