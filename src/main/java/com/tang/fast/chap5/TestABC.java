package com.tang.fast.chap5;


/**
 * @Classname TestABC
 * @Description
 * @Date 2022/12/27 12:21
 * @Author by tangyao
 */
public class TestABC {

    public static void main(String[] args) {
        String a = "";

        ABC abc = new ABC();
        int age = abc.getAge();
        abc.setName("aaa");
        System.out.println("abc.getName() = " + abc.getName());
////        
    }
}
