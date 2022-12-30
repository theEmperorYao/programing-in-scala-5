package com.tang.programinginscala5.controller;

/**
 * @Classname TestController
 * @Description
 * @Date 2022/8/25 01:25
 * @Author by tangyao
 */

public class TestController {

    static int n = 100_000_000;

    public static void f() {
        for (int i = 0; i < n; i++) {
            System.out.println("for loop with " + i);
        }
    }

    public static void main(String[] args) {
        long a = System.nanoTime();
        f();
        long b = System.nanoTime();
        System.out.println(b - a);
    }

}
