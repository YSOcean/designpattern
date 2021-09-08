package com.itcoke.designpattern.factorypattern.abstractfactory;


public class ExcelParser implements IOfficeParser {
    private String filePath;
    public ExcelParser(String filePath){
        this.filePath = filePath;
    }
    public ExcelParser(){}
    @Override
    public void parse() {
        System.out.println("解析 xlsx 文件");
    }
}
