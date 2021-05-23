package com.lovecoding.day05;

import java.util.Arrays;

/**
 * 实现一个化妆品商城中的化妆品管理
 */
public class Example2 {
    public static void main(String[] args) {
        ImportCosmeticManager cm = new ImportCosmeticManager();
        cm.add(new Cosmetic("大宝" , "国产" , 22));
        cm.add(new Cosmetic("蒂花之秀" , "进口" , 11));
        cm.add(new Cosmetic("舒肤佳" , "国产" , 33));
        cm.add(new Cosmetic("曼秀雷敦" , "进口" , 44));
        cm.printAll();
    }
}

/**
 * 打印输出所有进口的化妆品
 */
class ImportCosmeticManager extends CosmeticManager{

    public void printAll(){
        for(Cosmetic c : cosmetics){
            if(null != c){
                if("进口".equals(c.getType())){
                    System.out.println(c);
                }
            }
        }
    }

}
/**
 * 根据价格排序输出
 */
class SortCosmeticManager extends CosmeticManager{

    public void printAll(){
        Cosmetic[] cosmetics1 = Arrays.copyOf(cosmetics , cosmetics.length);

        for(int i = 0 ; i < count ; i ++ ){
            int minIndex = i;
            for (int j = i ; j < count ; j ++){
                if(cosmetics1[minIndex].getPrice() > cosmetics1[j].getPrice()){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                Cosmetic temp = cosmetics1[minIndex];
                cosmetics1[minIndex] = cosmetics1[i];
                cosmetics1[i] = temp;
            }
        }

        //super.printAll();
        for(int i = 0 ; i < count ; i ++){
            System.out.println(cosmetics1[i].toString());
        }
    }
}

class CosmeticManager{

    Cosmetic[] cosmetics = new Cosmetic[5];
    int count = 0 ;
    public void add(Cosmetic c){
        if(count == cosmetics.length){
            cosmetics = Arrays.copyOf(cosmetics , cosmetics.length + (cosmetics.length / 2 + 1));
        }
        cosmetics[count++] = c;
    }

    public void printAll(){
        for(int i = 0 ; i < count ; i ++){
            System.out.println(cosmetics[i].toString());
        }
    }
}

class Cosmetic{

    private String name;
    private String type;
    private int price;

    public Cosmetic() {
    }

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}