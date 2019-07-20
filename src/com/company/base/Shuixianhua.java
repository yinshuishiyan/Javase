package com.company.base;

public class Shuixianhua {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i*i*i+j*j*j+k*k*k==i*100+j*10+k){
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.println();
                    }
                }
            }
        }
        
        
        
    }
}
