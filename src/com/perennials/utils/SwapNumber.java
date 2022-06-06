package com.perennials.utils;

public class SwapNumber {

    public static void main(String[] args) {
        int i=10;
        int j=20;
        System.out.println("before swapping");
        System.out.println("i="+i);
        System.out.println("j="+j);
         i=i+j;
         j=i-j;
         i=i-j;
        System.out.println("after swapping");
        System.out.println("i="+i);
        System.out.println("j="+j);


    }
}
