package com.lovecoding.day05;

/**
 * 模板方法模式（Templete Method）
 */
public class Example8 {

    public static void main(String[] args) {
        BaseManager bm = new UserManager();
        bm.check("test","del");
    }


}

abstract class BaseManager{
    public void check(String username , String method){
        if("admin".equals(username)){
            execute(method);
        }else{
            System.out.println("没有权限操作此内容");
        }
    }

    abstract public void execute(String method);
}

class UserManager extends BaseManager{

    public void execute(String method){
        if("add".equals(method)){
            System.out.println("执行添加操作");
        }else if("del".equals(method)){
            System.out.println("执行删除操作");
        }
    }
}
class ClassManager  extends BaseManager{

    @Override
    public void execute(String method) {

    }
}
