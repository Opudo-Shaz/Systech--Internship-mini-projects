package com.example.gratis;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
         * LocalDateTime now = LocalDateTime.now();
         * LocalDate date = LocalDate.of(6, 1, 2014);
         * System.out.println(now);
         * System.out.println(date);
         */

        /*
         * int ans;
         * try {
         * int num = 10;
         * int div = 0;
         * ans = num / div;
         * }
         * catch (ArithmeticException e) {
         * ans = 0;
         * }
         * System.out.println(ans);
         */

        /*
         * int[][] nums = {
         * {1,2},
         * {3,4}
         * };
         * 
         * System.out.println(nums[1][0]);
         * 
         * 
         * int x;
         * 
         * if(true) {
         * x = 10;
         * }
         * 
         * System.out.println(x);
         */

        int[] num = { 1, 2, 3 };

        for (int i = 0; i < num.length; i++) {
            num[i]++;
        }

        System.out.println(num[1]);

        new B();
    }
}
