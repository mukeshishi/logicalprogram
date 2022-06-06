package com.perennials.utils;

public class RotateArrayElements {
    public static void rotateArray(int arr[],int rotateBy){
        int j=0;
        while(rotateBy>0){
            int temp=arr[arr.length-1];
            for( j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=temp;
            rotateBy--;
        }
    }
    public static void main(String[] args) {
       int arr[]={10,20,30,40,50};
       int rotateBy=3;
        rotateArray(arr,rotateBy);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
