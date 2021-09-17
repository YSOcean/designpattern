package com.itcoke.designpattern.composite.person;

/**
 * 部门类和员工类的抽象类
 */
public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public abstract double calculateSalary();

}
