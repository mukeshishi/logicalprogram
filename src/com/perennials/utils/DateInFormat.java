package com.perennials.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInFormat {
    public static void main(String[] args) {
        //apply format for current date
        Date date=new Date();

        //set  dd-Mon-yyyy format

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
        String strDate=simpleDateFormat.format(date); //set format for current date dd-mon-yyyy
        //display date
        System.out.println("Date in dd-MMM-yyyy="+strDate);

    }
}
