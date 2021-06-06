package com.lovecoding.day09;

import java.util.ArrayList;
import java.util.List;

/**
 * 一对多关系
 */
public class Example4 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        Student stu1 = new Student("小王", 2021001);
        Student stu2 = new Student("小张", 2021002);
        Student stu3 = new Student("小李", 2021003);

        studentList.add(stu1);
        studentList.add(stu2);

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(stu1);
        studentList1.add(stu3);
        Teacher t = new Teacher("张老师",813 , studentList);
        Teacher t1 = new Teacher("李老师",666 , studentList1);

        System.out.println(t);

        System.out.println(t1);

    }
}

class Teacher{

    private String name;
    private int tno;

    private List<Student> studentList;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", tno=" + tno +
                ", studentList=" + studentList +
                '}';
    }

    public Teacher(String name, int tno, List<Student> studentList) {
        this.name = name;
        this.tno = tno;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}

class Student {

    private String name;
    private int sno;

    public Student() {
    }

    public Student(String name, int sno) {
        this.name = name;
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                '}';
    }
}