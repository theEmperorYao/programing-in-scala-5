package com.tang.fast.chap5;

/**
 * @Classname TestABC
 * @Description
 * @Date 2022/12/27 12:21
 * @Author by tangyao
 */
public class TestABC {

    public static void main(String[] args) {

        ABC abc = new ABC();
        var age = abc.getAge();
        abc.setName("aaa");
        System.out.println("abc.getName() = " + abc.getName());
        
    }
}
