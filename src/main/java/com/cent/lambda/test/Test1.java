package com.cent.lambda.test;

import java.util.Collections;
import java.util.Comparator;

public class Test1 {
    Comparator<Integer> com = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {  //降序排列
            return Integer.compare(o2,o1);
        }
    };


    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 4;
        System.out.println(Integer.compare(a,b));

    }
}
