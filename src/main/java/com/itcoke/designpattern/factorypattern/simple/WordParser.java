package com.itcoke.designpattern.factorypattern.simple;

public class WordParser implements IOfficeParser{
    private String filePath;
    public WordParser(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void parse() {
        System.out.println("解析 docx 文件");
    }
}
