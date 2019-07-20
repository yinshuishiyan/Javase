package com.company.base;

public class Shulie {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c ;

        System.out.print(a+" "+b+" ");

        for (int i = 0; i < 14 ; i++) {

            c = a + b;
            a = b;
            b = c;

            System.out.print(c+" ");

        }



    }
}
