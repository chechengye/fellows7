package com.lovecoding.day05;

/**
 * 简单工厂模式
 */
public class Example10 {

    public static void main(String[] args) {
        /*Product phone = new Phone();
        phone.work();
        Product computer = new Computer();
        computer.work();*/
        Product product = ProductFactory.getProduct("computer111");
        if(null != product){
            product.work();
        }else{
            System.out.println("工厂还不生产此电子设备..");
        }
    }
}
abstract class ProductFactory implements Product{

    public static Product getProduct(String name){
        if("phone".equals(name)) return new Phone();
        else if("computer".equals(name)) return new Computer();
        else return null;
    }

}

interface Product{

    void work();
}

class Phone implements Product{
    public void work(){
        System.out.println("手机开始工作...");
    }
}
class Computer  implements Product{
    public void work(){
        System.out.println("电脑开始工作...");
    }
}
