package com.perennials.utils;

public class ElementAppearOnce {
    public static void main(String[] args) {
        int a[]={2,5,3,4,3,5,4};
        int res=a[0];
        for(int i=1;i<a.length;i++){
            res=res^a[i];

        }
        System.out.println("single elements is=" +res);
    }
}
