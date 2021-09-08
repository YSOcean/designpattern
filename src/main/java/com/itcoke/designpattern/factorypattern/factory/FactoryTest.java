package com.itcoke.designpattern.factorypattern.factory;


public class FactoryTest {
    public static void main(String[] args) throws Exception {
        String filePath = "文档.docx";
        IOfficeParser parser = OfficeParserFactory.getParser(filePath);
        parser.parse();

        String filePath1 = "旧文档.doc";
        IOfficeParser parser1 = OfficeParserFactory.getParser(filePath1);
        parser1.parse();
    }
}
