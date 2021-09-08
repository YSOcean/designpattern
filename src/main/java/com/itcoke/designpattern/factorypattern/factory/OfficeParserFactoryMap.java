package com.itcoke.designpattern.factorypattern.factory;


import java.util.HashMap;
import java.util.Map;

public class OfficeParserFactoryMap {
    private static final Map<String, IOfficeParserFactory> parserFactoryCached = new HashMap<>();
    static {
        parserFactoryCached.put("docx",new WordParserFactory());
        parserFactoryCached.put("xlxs",new ExcelParserFactory());
        parserFactoryCached.put("pptx",new PptParserFactory());
        parserFactoryCached.put("doc",new DocParserFactory());
    }
    public static IOfficeParserFactory getOfficeParseFactory(String type){
        if(type == null || type.isEmpty()){
            return null;
        }
        return parserFactoryCached.get(type.toLowerCase());
    }


}
