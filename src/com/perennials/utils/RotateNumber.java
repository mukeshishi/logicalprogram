package com.perennials.utils;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number and rotate by value");
        long n=sc.nextLong();
        int r=sc.nextInt();

        // find number of digit
            long temp=n;
            int nod=0;

            while(temp!=0){
                nod++;
                temp=temp/10;
            }

            int div=1;
            int mul=1;

            //numeber is 563421
            // rotate by 2.
            //we want div=100,mul=1000.
            for(int i=1;i<=nod;i++){
                if(i<=r){
                    div=div*10;
                }
                else{
                    mul=mul*10;
                }
            }
            long quo=n/div;
            long rem=n%div;
            long res=rem*mul+quo;
        System.out.println(res);

    }
}
