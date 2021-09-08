package com.itcoke.designpattern.factorypattern.factory;

public class PptParser implements IOfficeParser {
    private String filePath;
    public PptParser(){}
    public PptParser(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void parse() {
        System.out.println("解析 pptx 文件");
    }
}
