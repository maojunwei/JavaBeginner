package com.maojw.bean;

public class OverrideTest02 {
    public String name;
    @Override
    public String toString(){
        return "Person:name=" + name;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof  Person){
            Person p = (Person) o;
            return this.name.equals(p.name);
        }
        return false;
        }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    }

