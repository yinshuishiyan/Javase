package com.company.base;

public class Text02 {
    public static void main(String[] args) {
        Text02 ob = new Text02();
        ob.a =22;
        System.out.println(ob.a);
        ob.aa();
        ob.aaa();

    }

    int a =10;
    public void aa(){
        a=11;//赋值变量，下边变量的值也会改变
        System.out.println(a);
    }
    public void aaa(){
        a=12;
        System.out.println(a);
    }



}
