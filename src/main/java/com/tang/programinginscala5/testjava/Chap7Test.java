package com.tang.programinginscala5.testjava;

//import com.tang.programinginscala5.chap6.Rational;

/**
 * @Classname Chap7Test
 * @Description
 * @Date 2022/8/7 22:43
 * @Author by tangyao
 */
public class Chap7Test {

    public static void main(String[] args) {
        int i = 0;
        boolean fountIt = false;
        while (i < args.length) {
            if (args[i].startsWith("-")) {
                i++;
                continue;
            }
            if (args[i].endsWith(".scala")) {
                fountIt = true;
                break;

            }
            i++;
        }
    }
}
