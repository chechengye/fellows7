package com.lovecoding.day06;

/**
 * 异常讲解
 * 所有异常的统一父类Exception
 */
public class Example4 {

    public static void main(String[] args) {
        System.out.println(div(10, 0));
    }

    /**
     * 异常会中断程序继续执行（问题）
     * try{} 块，尝试 某行或某块代码可能会出现异常的行为
     * catch(){} 块，进行异常的统一处理
     * finally{} 块，是不管出没出现都会被执行的代码块。
     * 面试题： finally块与catch块中return谁先执行 。若出现异常会优先执行catch块的内容，但若存在return语句，它会立即执行finally代码块。
     *  如果finally代码中存在return，会直接返回结束程序。若不存在return语句，会返回catch中继续执行return语句并结束程序。
     * @param a
     * @param b
     */
    public static int div(int a , int b){
        try{
            int[] arr = null;
            //System.out.println(arr[5]);
            if(null != arr){
                System.out.println(arr.length);//java.lang.NullPointerException : 运行期空指针异常
            }
            System.out.println(arr.length);
            //System.out.println(a / b); //java.lang.ArithmeticException : 运行期算数异常 。
            System.out.println("--------try块代码继续执行---------");

            /*arr = null;
            xx.close();*/

        }catch (ArithmeticException e){
            System.out.println("捕获了算数异常");
        }catch (NullPointerException e){
            System.out.println("捕获了空指针异常");
            return 0;
        }catch (Exception e){
            System.out.println("异常的统一捕获，将遗漏的异常进行捕获。");
        } finally {//最终一定被执行
            System.out.println("会做统一代码处理，比如关闭流对象、释放空间等");
            return 100;
        }
       /* System.out.println("-------程序继续执行了-------");
        return -1;*/
    }
}
