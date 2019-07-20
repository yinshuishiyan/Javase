package com.company.base;

import java.util.Scanner;

public class Jitutonglong {
    public static void main(String[] args) {

        System.out.println("请输入头的个数");
        Scanner sc = new Scanner(System.in);
        int head = sc.nextInt();
        System.out.println("请输入脚的个数");
        Scanner sca = new Scanner(System.in);
        int foot = sca.nextInt();


        if (head > 0 && foot > 0  && (foot % 2 == 0) && (foot >= 2 * head) && (foot <= 4 * head)) {
            int a = 0;
            int b = 0;
            a = (4 * head - foot) / 2;
            b = head - a;
            System.out.println("鸡：" + a);
            System.out.println("兔" + b);

        } else {
            System.out.println("你输入的数字不合法");
        }

    }
}
