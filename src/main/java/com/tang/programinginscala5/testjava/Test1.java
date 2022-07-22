package com.tang.programinginscala5.testjava;


/**
 * @Title: Test1
 * @Description:
 * @author: tangyao
 * @date: 2022/7/22 11:57
 * @Version: 1.0
 */

public class Test1 {
    public static void main(String[] args) {
        String name = "String";
        boolean b = name.chars().anyMatch(Character::isUpperCase);
        System.out.println("b = " + b);
    }
}