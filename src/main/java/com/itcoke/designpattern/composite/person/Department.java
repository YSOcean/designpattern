package com.itcoke.designpattern.composite.person;

import java.util.ArrayList;
import java.util.List;

public class Department extends HumanResource{
    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id){
        super(id);
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0d;
        for (HumanResource hr : subNodes){
            totalSalary += hr.calculateSalary();
        }
        this.salary = totalSalary;
        return totalSalary;
    }

    public void addSubNode(HumanResource humanResource){
        subNodes.add(humanResource);
    }
}
