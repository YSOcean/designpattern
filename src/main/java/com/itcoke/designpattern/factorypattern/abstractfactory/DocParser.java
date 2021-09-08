package com.itcoke.designpattern.factorypattern.abstractfactory;

import com.itcoke.designpattern.factorypattern.factory.IOfficeParser;

public class DocParser implements IOldOfficeParser {
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
