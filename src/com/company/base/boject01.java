package com.company.base;

public class boject01 {

    public static void main(String[] args) {
        boject01 bo = new boject01();
        bo.setName("sdf");
        bo.getName();
        System.out.println(bo.getName());
    }


    private String name = "sdlj";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
