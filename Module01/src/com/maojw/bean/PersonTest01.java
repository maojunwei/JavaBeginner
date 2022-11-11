package com.maojw.bean;
//自定义构造方法,在一个构造方法内部调用另一个构造方法
public class PersonTest01 {
    private String name;
    private int age;
    public PersonTest01(String name,int age){
        this.name = name;
        this.age = age;
    }
    public PersonTest01(String name){
            this(name,18);
    }
    public  PersonTest01(){
        this("unnamed");
    }


    public static void main(String[] args){

    }

}

