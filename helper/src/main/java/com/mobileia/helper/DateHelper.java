package com.mobileia.helper;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by matiascamiletti on 15/3/17.
 */

public class DateHelper {

    public static String dateToStringMysql(Date date){
        SimpleDateFormat service = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return service.format(date);
    }

    public static Date stringMysqlToDate(String date){
        return stringMysqlToDate(date, true);
    }

    public static Date stringMysqlToDate(String date, boolean isUTC){
        ParsePosition pos = new ParsePosition(0);
        SimpleDateFormat service = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(isUTC){
            service.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return service.parse(date, pos);
    }
}
