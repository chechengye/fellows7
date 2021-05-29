package com.lovecoding.day06;

/**
 * 内部类应用链表案例
 */
public class Example2 {
    public static void main(String[] args) {
        NodeManager nm = new NodeManager();
        nm.add(5);
        nm.add(4);
        nm.add(3);
        nm.add(2);
        nm.add(1);
        nm.print();
        System.out.println("-------------------");
        /*nm.delete(4);
        nm.print();*/
        System.out.println("-------------------");
        //nm.update(0 , 888);
        //nm.print();
        System.out.println("-------------------");
        System.out.println(nm.find(55));
        System.out.println("--------------------");
        nm.insert(5 , 77);
        nm.print();

    }
}

class NodeManager{
    //头节点、根节点
    Node root;
    int currentIndex;
    /**
     * 增加节点
     */
    public void add(int data){
        if(null == root){
            root = new Node(data);
        }else{
            root.addNode(data);
        }
    }

    /**
     * 删除节点 、根据值或者索引index
     * @param data
     */
    public void delete(int data){
        if(null != root){
            if(data == root.getData()){
                root = root.next;
            }else{
                root.deleteNode(data);
            }
        }
    }

    /**
     * 根据索引位置进行更新操作
     * @param index
     * @param data
     */
    public void update(int index , int data){
        if(null != root) {
            if(currentIndex == index){
                root.setData(data);
            }else{
                root.updateNode(index , data);
            }
        }
    }

    /**
     * 查询节点是否存在
     */
    public boolean find(int data){
        if(null == root) return false;
        else {
            if(data == root.getData()) return true;
            else return root.findNode(data);
        }
    }

    /**
     * 显示
     */
    public void print(){
        if(null != root) {
            System.out.print(root.getData() + "->");
            root.printNode();
        }
    }

    /**
     * 插入一个节点
     * @param index
     */
    public void insert(int index , int data) {
        if(null != root){
            if(currentIndex == index){
                Node newNode = new Node(data);
                newNode.next = root;
                root = newNode;
            }else{
                root.insertNode(index , data);
            }
        }
    }

    class Node{//节点
        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }
        /**
         * 递归调用依次寻找为空的节点，并赋值
         */
        public void addNode(int data){
            if(null == this.next){
                this.next = new Node(data);
            }else{
                this.next.addNode(data);
            }
        }

        /**
         * 递归打印节点数据
         */
        public void printNode() {
            if(null != this.next){
                System.out.print(this.next.getData() + "->");
                this.next.printNode();
            }
        }

        /**
         * 递归查找删除
         * @param data
         */
        public void deleteNode(int data) {
            if(null != this.next){
                if(data == this.next.data){
                    this.next = this.next.next;
                }else{
                    this.next.deleteNode(data);
                }
            }
        }

        /**
         * 递归循环查找更新
         * @param data
         */
        public void updateNode(int index , int data) {
            if(null != this.next){
                if(++currentIndex == index){
                    this.next.data = data;
                }else{
                    this.next.updateNode(index , data);
                }
            }
        }

        /**
         * 递归查找
         * @param data
         * @return
         */
        public boolean findNode(int data) {
            if(null == this.next) return false;
            else{
                if(data == this.next.data) return true;
                else return this.next.findNode(data);
            }
        }

        /**
         * 递归插入
         * @param index
         * @param data
         */
        public void insertNode(int index, int data) {
            if(null != this.next){
                if(++currentIndex == index){
                    Node newNode = new Node(data);
                    newNode.next = this.next;
                    this.next = newNode;
                }else{
                    this.next.insertNode(index , data);
                }
            }
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }



    }
}