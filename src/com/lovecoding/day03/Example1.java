package com.lovecoding.day03;

/**
 * 方法
 * 定义： 方法又叫函数 - 它是一块可复用的代码
 *
 * 普通方法的格式：
 * 修饰符 - public（公有的） 、private （私有的）
 * 关键字 - static 静态的、主函数想要调用其它方法，其它方法也要有static
 * 返回值的类型 - 八种基本数据类型、引用类型 、 void - 没有返回值时不能省略
 * 方法的名称 - 见名知意 、 驼峰命名、首字母小写
 * () - 不能省 ，即使没有参数
 * 参数 - 形参 、 实参 （给形参赋值的参数叫实参）
 * {} ： 方法的作用域
 * 传递的 2 - 3 : 称为实参
 * 返回值可以接收、也可以不接收
 * 实参类型传递要 <= 形参的类型范围
 *
 * return关键字
 * 1、若当前方法没有返回值类型，即返回值类型是void，那么当前方法中可以不写return
 * 2、return即表示结束一个方法，也可以将返回值返回给调用当前方法的调用者
 * 3、return返回值时一次只能返回一个值，不可以返回多个值
 * 4、一个方法中可以有多个return，但被执行的只能有一个，所以需要判断 (return 语句就是结束方法的)
 */
public class Example1 {

    public static void main(String[] args) {
        //1顾客
        /*System.out.println("1、宫保鸡丁");
        System.out.println("2、锅包肉");
        System.out.println("3、鱼香肉丝");*/
        short s = 2;
        String c = getMenu(s);//方法的调用
        System.out.println("1号顾客点的是" + c);

        //2顾客
        System.out.println("-----------------------------");
       /* System.out.println("1、宫保鸡丁");
        System.out.println("2、锅包肉");
        System.out.println("3、鱼香肉丝");*/
       getMenu(3 );// 方法可以重复调用

        //3
    }

    /**
     * 方法的定义
     * 获取菜单
     * no : 实参
     */
    public static String getMenu(int no){
        System.out.println("1、宫保鸡丁");
        System.out.println("2、锅包肉");
        System.out.println("3、鱼香肉丝");

        switch (no){
            case 1:
                return "宫保鸡丁";
            case 2:
                return "锅包肉";
            case 3:
                return "鱼香肉丝";
            default:
                return "sorry , 饭馆没有这个菜！";

        }
    }

    public static void testMethod(String str){
        if(str == null)
            return;//返回值类型是空，return 不能跟任何参数

        System.out.println(str);
    }



}
