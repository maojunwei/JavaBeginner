package com.maojw.bean;
//子类不会继承任何父类的构造方法，子类默认的构造方法是编译器自动生成的，不是继承的
public class PersonExtendTest01 {
    public static void main(String[] args) {
        Student s = new Student("mjw", 12, 89);
        s.printStudentInfo();
    }
}
    class Person{
        protected String name;
        protected int age;
        public Person(String name,int age){
            this.name = name;
            this.age = age;
        }
    }
    class Student extends Person{
        protected int score;
        public Student(String name,int age,int score){
            super(name,age);
            this.score = score;
        }
        public void printStudentInfo(){
            System.out.println(this.score);
        }
    }

