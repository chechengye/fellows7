package com.lovecoding.day10.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于接口式的动态代理  -- JDK动态代理
 *
 * 还有一种叫cglib动态代理  -- 继承式的动态代理
 */
public class ProxyShopping implements InvocationHandler {
    private Object target;

    public Shopping getProxyShopping(Object target){
        //通过Class类获取类加载信息、类接口信息
        this.target = target;
        return (Shopping) Proxy.newProxyInstance(target.getClass().getClassLoader() , target.getClass().getInterfaces() , this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //实现代理的过程
        System.out.println("代购去海外淘货了/....");
        Object invoke = method.invoke(target, args);
        System.out.println(invoke);
        System.out.println("代理后..结账");
        return invoke;
    }
}
