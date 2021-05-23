package com.lovecoding.day05;

/**
 * 静态代理模式（Proxy）
 */
public class Example11 {
    public static void main(String[] args) {
       Action actor =  new Actor();
       Action proxy = new Proxy(actor);//代理之后的对象
       proxy.doAction();
    }
}

/**
 * 经纪人
 */
class Proxy implements Action{

    private Action target; //目标对象

    public Proxy(Action target){
        this.target = target;
    }


    @Override
    public void doAction() {
        System.out.println("谈剧本..谈广告等");
        long startTime = System.currentTimeMillis();

        this.target.doAction();

        long endTime = System.currentTimeMillis();

        System.out.println("演戏一共花费 : " + (endTime - startTime));
    }
}

interface Action{
    void doAction();
}
/**
 * 演员类
 */
class Actor implements Action{

    public void doAction(){
        System.out.println("我演戏/拍广告");
        for(int i = 0 ; i < 10000 ; i++){
            System.out.print("");
        }
    }
}
