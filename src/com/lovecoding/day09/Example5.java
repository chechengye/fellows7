package com.lovecoding.day09;

import java.util.ArrayList;
import java.util.List;

/**
 * 多对多关系
 */
public class Example5 {

    public static void main(String[] args) {
        Student1 s1 = new Student1("花花",001 , 22);
        Student1 s2 = new Student1("祺祺",002 , 33);
        Course c1 = new Course("英语",1);
        Course c2 = new Course("语文",2);
        Course c3 = new Course("数学",3);
        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        List<StudentAndCourse> sacList = new ArrayList<>();
        StudentAndCourse sac = new StudentAndCourse(s1.getSno() , c1.getCno());
        StudentAndCourse sac1 = new StudentAndCourse(s1.getSno() , c3.getCno());
        sacList.add(sac);
        sacList.add(sac1);
        //查询学生1选修的所有课程
        for(StudentAndCourse sa : sacList){
            if(s1.getSno() == sa.getSno()){
                for(Course c : courses){
                    if(c.getCno() == sa.getCno()){
                        System.out.println(s1.getSname() + "学生选修的课程为：" + c.getCname());
                    }
                }

            }
        }
    }
}

class Student1{
    private String sname;

    private int sno;

    private int age;

    public Student1(String sname, int sno, int age) {
        this.sname = sname;
        this.sno = sno;
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Course{
    private String cname;

    private int cno;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public Course(String cname, int cno) {
        this.cname = cname;
        this.cno = cno;
    }
}

class StudentAndCourse{

    private int sno;

    private int cno;

    public StudentAndCourse(int sno, int cno) {
        this.sno = sno;
        this.cno = cno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }
}