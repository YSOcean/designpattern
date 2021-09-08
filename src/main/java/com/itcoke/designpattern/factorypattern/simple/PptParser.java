package com.itcoke.designpattern.factorypattern.simple;

public class PptParser implements IOfficeParser {
    private String filePath;
    public PptParser(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void parse() {
        System.out.println("解析 pptx 文件");
    }
}
