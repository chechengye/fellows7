package com.lovecoding.day07.util;

import java.text.DecimalFormat;

public class DecimalFormatUtil {

    /**
     * 返回两位的浮点数
     * @param deal
     * @return
     */
    public static String getDecimalForTwo(double deal){
        return new DecimalFormat("#.##").format(deal);
    }

    /**
     * 返回六位的浮点数
     * @param deal
     * @return
     */
    public static String getDecimalForSix(double deal){
        return new DecimalFormat("0.000000").format(deal);
    }
}
