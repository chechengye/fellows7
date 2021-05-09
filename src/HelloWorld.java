/**
 * IDEA快捷键
 * psvm : 主函数
 * sout ： 输出打印语句
 * ctrl + x : 剪切
 * ctrl + z ：向前撤销
 * ctrl + c ： 复制
 * ctrl + v : 粘贴
 * ctrl + 上、下箭头即可
 * ctrl + 鼠标滑轮控制字体放大缩小
 * ctrl + F ：搜索整个文件字符串
 * ctrl + o : 搜索方法的
 * ctrl + H : 搜索整个文档
 * ctrl + shift + R : 搜索类的
 *
 * Java语法
 * 1、严格区分大小写
 * 2、格式自由
 * 3、位置不能随意摆放
 * 4、代码分为结构定义语句和功能执行语句
 * 5、Java中所有{} () []等 都是成对出现的
 * 6、Java代码所有输入的字符都是英文输入法下面的
 * 7、功能执行语句的最后必须用分号结束
 * 8、JVM默认执行的主函数
 *
 * 注释语法：
 * Java分为三种注释方式 （
 * 1、文档注释 /** 注释中不能包含同样格式的注释，否则会失效 （标记一个方法、一个类解释、谁编写的 、编写的日期）
 * 2、多行注释、块注释 /*  （注释掉一段代码块）
 * 3、单行注释 // 标记、解释一行代码的 （干嘛用的、谁写的）
 * ）
 *
 * Java入门程序 - 解释了Java基本语法的使用
 * @author cc
 * @createTime 2021-05-09
 */
public class HelloWorld {
    /**
     * 结构定义语句
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello , world");//功能执行语句
        //System.out.println(); 用不上了，不再使用了
        int[] arr = new int[5];
        /*
        多行注释，块注释
        System.out.println("test");
        System.out.println();*/
        max(arr);

    }

    /**
     * 求最大值的
     * @param arr 传递的数组参数，方便求值
     */
    public static void max(int[] arr){

    }
}
