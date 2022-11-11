package com.maojw.bean;
//实例方法的调用是基于运行时实例类型的动态调用，而不是变量的声明类型
public class OverrideTest01 {
    public static void main(String[] args){
        Person01 p = new Student01();
        p.run();
    }
}
class Person01{
    public void run(){
        System.out.println("Person.run");
    }
}
class Student01 extends Person01{
    @Override
    public void run(){
        System.out.println("Student.run");
    }
}

