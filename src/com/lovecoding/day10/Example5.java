package com.lovecoding.day10;


import com.lovecoding.day10.proxy.ProxyShopping;
import com.lovecoding.day10.proxy.Shopping;
import com.lovecoding.day10.proxy.User;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * 静态代理： - 经纪人和演员
 *
 * 海淘
 * 代购 - 用户
 */
public class Example5 {
    public static void main(String[] args) {
        Shopping user = new User();
        ProxyShopping ps = new ProxyShopping();
        Shopping proxyShopping = ps.getProxyShopping(user); //真正的代理后的对象

        proxyShopping.shopping();
    }

}
