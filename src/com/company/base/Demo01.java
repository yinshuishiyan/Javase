package com.company.base;

import java.util.Scanner;

public class Demo01 {

    static int money = 10000;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        showMenu();

    }

    static void showMenu() {
        while (true) {
            System.out.println("欢迎欢迎热烈欢迎");
            System.out.println("1.查看余额");
            System.out.println("2.取款");
            System.out.println("3.存钱");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入编号来选择功能");

            int index = input.nextInt();
            input.nextLine();
            switch (index) {
                case 1:
                    lookMoney();
                    break;
                case 2:
                    drawMoney();
                    break;
                case 3:
                    addMoney();
                    break;
                case 4:
                    transforMoney();
                    break;
                case 5:
                    System.out.println("你已经退出");
                    return;
                default:
                    System.out.println("没有此项");
            }
        }
    }

    static void lookMoney() {
        System.out.println("余额为：" + money);
    }

    static void drawMoney() {
        System.out.println("请输入取款金额");
        int draw = input.nextInt();
        input.nextLine();
        if (money > draw) {
            money = money - draw;
            System.out.println("取钱成功");
        } else {
            System.out.println("你的账户余额不足");
        }
    }

    static void addMoney() {
        System.out.println("请输入存款金额");
        int add = input.nextInt();
        input.nextLine();
        money += add;
        System.out.println("存钱成功");
    }

    static void transforMoney() {
        System.out.println("请输入转账金额");
        int draw = input.nextInt();
        input.nextLine();
        if (money > draw) {
            money = money - draw;
            System.out.println("取钱成功");
        } else {
            System.out.println("你的账户余额不足");
        }
    }
}
