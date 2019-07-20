package com.company.base;

import java.util.Arrays;
import java.util.Random;

public class Arr {
    public static void main(String[] args) {

        Random r = new Random();

        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        Arrays.sort(arr);
        String arrToString = Arrays.toString(arr);
        System.out.println(arrToString);

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
            sum+=arr[i];
		}


        System.out.println("最大值是："+arr[0]);
        System.out.println("最小值是："+arr[4]);
        System.out.println("总和是："+sum);
        System.out.println("平均数是："+sum/arr.length);



        }
}
