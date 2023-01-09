package com.tang.fpinscala_second.chap1;

import com.tang.fpinscala_second.chap1.ThirdExample.Cafe;
import com.tang.fpinscala_second.chap1.ThirdExample.Charge;
import com.tang.fpinscala_second.chap1.ThirdExample.Coffee;
import com.tang.fpinscala_second.chap1.ThirdExample.CreditCard;
import scala.Tuple2;
import scala.collection.immutable.List;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * @Classname CoffeeTest
 * @Description
 * @Date 2023/1/8 13:57
 * @Author by tangyao
 */
public class CoffeeTest {

    /**
     * val first = iterableFactory.newBuilder[A1]
     * val second = iterableFactory.newBuilder[A2]
     * foreach { a =>
     * val pair = asPair(a)
     * first += pair._1
     * second += pair._2
     * }
     * (first.result(), second.result())
     */
    public static <T1, T2, T> Tuple2<T1, T2> unzip(ArrayList<T> t, Function<T, Tuple2<T1, T2>> function) {
        ArrayList<T1> t1s = new ArrayList<T1>();
        ArrayList<T2> t2s = new ArrayList<>();
        for (T item : t) {
            Tuple2<T1, T2> tuple2 = function.apply(item);
            T1 t1 = tuple2._1;
            t1s.add(t1);
            T2 t2 = tuple2._2;
            t2s.add(t2);
        }
        return new Tuple2(t1s, t2s);
    }


    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        CreditCard creditCard = new CreditCard();
        Tuple2<List<Coffee>, Charge> listChargeTuple2 = cafe.buyCoffees(creditCard, 10);

        System.out.println("listChargeTuple2 = " + listChargeTuple2);
        List<Coffee> coffeeList = listChargeTuple2._1;
        System.out.println("coffeeList = " + coffeeList);
        Charge charge = listChargeTuple2._2;
        System.out.println("charge = " + charge);
        
        

    }
}
