package com.lovecoding.day07;

/**
 * 对象克隆应用场景
 * 1、会产生大量的相同的对象。（每个对象都进行实例化的时候，会占用大量内存）
 * 2、多利（克隆绵羊）
 *
 */
public class Example6 {

    public static void main(String[] args) {
        Bullet bullet = new Bullet();
        bullet.setColor("红色");
        bullet.setSize(10);
        try {
            Bullet bullet1 = (Bullet)bullet.clone();//没有进行new就不会申请内存空间
            System.out.println(bullet1);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
/**
 * 子弹
 * Cloneable : 标记接口，没有任何方法体。只做标记行为，本类可以做哪些事
 */
class Bullet implements Cloneable{//java.lang.CloneNotSupportedException

    private String color;
    private int size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * 从新Object的方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
