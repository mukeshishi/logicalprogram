package com.perennials.utils;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        //declare an array..
        int arr[]=new int[n];

        System.out.println("enter the array value");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int temp;
        int s=0;
        int e=n-1;

        while(s<e){
           temp=arr[s];
           arr[s]=arr[e];
           arr[e]=temp;
           s++;
           e--;
        }

        System.out.println("print reverse array=" );
        for(int j=0;j<n;j++) {
            System.out.print(arr[j]);
        }
    }


}
