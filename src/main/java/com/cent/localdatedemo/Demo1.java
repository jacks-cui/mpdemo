package com.cent.localdatedemo;

import java.time.LocalDate;

public class Demo1 {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);

//        LocalDate localDate1 = LocalDate.of(2019,1,7);
//        System.out.println(localDate1);
//        System.out.println("===================================================>");

//        LocalDate localDate = LocalDate.of(2020,1,7);
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDate.getDayOfYear());

//        LocalDate localDate = LocalDate.of(2019,1,7);
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getMonthValue());
//        //当前月份有多少天
//        System.out.println(localDate.lengthOfMonth());
//        LocalDate localDate = LocalDate.of(2019,1,7);
//        System.out.println(localDate.lengthOfYear());
//        //是否为闰年
//        System.out.println(localDate.isLeapYear());

        LocalDate localDate = LocalDate.of(2019,1,7);
        System.out.println(localDate.withDayOfMonth(2));
        System.out.println(localDate.withDayOfYear(40));
        System.out.println(localDate.withMonth(2));
        System.out.println(localDate.withYear(2019));
    }
}
