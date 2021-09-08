package com.itcoke.designpattern.factorypattern.simple;

public class ExcelParser implements IOfficeParser{
    private String filePath;
    public ExcelParser(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void parse() {
        System.out.println("解析 xlsx 文件");
    }
}
