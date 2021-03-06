package com.example.visitormanagement;

import android.text.format.DateFormat;

import com.example.visitormanagement.Model.HostModel;
import com.example.visitormanagement.Model.VisitorModel;

import java.util.Calendar;
import java.util.Locale;

public class CommonData {

    public static HostModel selectedhost = new HostModel();
    public static VisitorModel visitordetails = new VisitorModel();
    public static int flag=0;

    //To get Date as String format when timestamp is given as parameter
    public static String getDate(long time)
    {
        Calendar calendar=Calendar.getInstance(Locale.ENGLISH);
        calendar.setTimeInMillis(time);
        StringBuilder date=new StringBuilder(DateFormat.format("dd-MM-yyyy",calendar).toString());
        return date.toString();
    }
    //To get Time as String format when timestamp is given as parameter
    public static String getTime(long time)
    {
        Calendar calendar=Calendar.getInstance(Locale.ENGLISH);
        calendar.setTimeInMillis(time);
        StringBuilder time2=new StringBuilder(DateFormat.format("HH:mm:ss",calendar).toString());
        return time2.toString();
    }

}
