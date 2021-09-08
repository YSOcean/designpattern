package com.itcoke.designpattern.factorypattern.simple;

public class SimpleFactoryTest {

    public static void main(String[] args) throws Exception {
        String filePath = "文档.docx";
        IOfficeParser parser = OfficeParserFactory.getParser(filePath);
        parser.parse();

        String filePath1 = "表格.xlsx";
        IOfficeParser parser1 = OfficeParserFactory.getParser(filePath1);
        parser1.parse();
    }
}
