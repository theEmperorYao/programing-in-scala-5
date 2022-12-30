package com.tang.pragmaticscala.chap5;


import java.util.ArrayList;

/**
 * @Title: Trouble
 * @Description:
 * @author: tangyao
 * @date: 2022/9/27 11:45
 * @Version: 1.0
 */

class Fruit {
}

class Banana extends Fruit {

}

class Apple extends Fruit {

}

public class Trouble {
    public static void main(String[] args) {
//        Banana[] basketOfBanana = new Banana[2];
//        basketOfBanana[0] = new Banana();
//        Fruit[] basketOfFruits = basketOfBanana;
//        // 在这行发生的java.lang.ArrayStoreException 但是java 编译器却没有在上一行阻止我们这样做
//        basketOfFruits[1] = new Apple();
//        for (Banana banana : basketOfBanana) {
//            System.out.println(banana);
//        }

        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Object> list2 = list;

        ArrayList list3 = list;
        System.out.println("list3 = " + list3);
    }
}