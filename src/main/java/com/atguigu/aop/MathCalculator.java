package com.atguigu.aop;

/**
 * @author zhangge
 * @date 2019/1/14 - 17:32
 */
public class MathCalculator {

    public int div(int i,int j){
        System.out.println("MathCalculator div 运行");
        return i/j;
    }
}
