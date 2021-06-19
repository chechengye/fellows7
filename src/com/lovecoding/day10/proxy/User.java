package com.lovecoding.day10.proxy;

public class User implements Shopping {
    @Override
    public String shopping() {
        return "购物 - 想要购买商品";
    }
}
