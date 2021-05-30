package com.lovecoding.day07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期操作类
 */
public class Example4 {

    public static void main(String[] args) {
        //获取当前系统的时间
        Date date = new Date(); //WEB项目应用最多的
        System.out.println(date);

        System.out.println("--------------------");

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.YEAR) + "年"
                + (calendar.get(Calendar.MONTH) + 1) + "月" + calendar.get(5) + "日 "
                + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND));

        //DateFormat类及子类SimpleDateFormat
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//应用场景：文件取名。订单号。（UUID正常取不重复值的）
        System.out.println(df.format(date));
    }
}
