package com.itcoke.designpattern.factorypattern.factory;

public class WordParser implements IOfficeParser {
    private String filePath;
    public WordParser(){}
    public WordParser(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void parse() {
        System.out.println("解析 docx 文件");
    }
}
