package com.itcoke.designpattern.factorypattern.factory;

public class DocParser implements IOfficeParser{
    private String filePath;
    public DocParser(String filePath){
        this.filePath = filePath;
    }
    public DocParser(){}
    @Override
    public void parse() {
        System.out.println("解析 doc 文件");
    }
}
