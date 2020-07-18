package com.demo07;

public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus(int bonus) {
        return bonus;
    }

    public void work() {
        System.out.println("工号为" + this.id + "基本工资为" + this.salary + "奖金为" + this.bonus + "的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
