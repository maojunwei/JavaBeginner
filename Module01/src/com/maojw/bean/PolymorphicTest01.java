package com.maojw.bean;
//多态：允许添加更多类型的子类实现功能的扩展，而不需要修改基于父类的代码
public class PolymorphicTest01 {
    public static void main(String[] args){
        Income[] incomes = new Income[]{new Income(30000),
                new Salary(50000),new StateCouncilSpecialAllowance(15000)};
        System.out.println(totalTax(incomes));
    }
    public static double totalTax(Income... incomes){
        double total = 0;
        for(Income income:incomes){
            total += income.getTax();
        }
        return total;
    }
}
class Income{
    protected double income;
    public Income(double income){
        this.income = income;
    }
    public double getTax(){
        return income*0.1;
    }
}
class Salary extends Income{
    public Salary(double income){
        super(income);
    }
    @Override
    public double getTax(){
        if(income <= 5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}
class StateCouncilSpecialAllowance extends Income{
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return 0;
    }
}
