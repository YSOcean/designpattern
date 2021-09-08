package com.itcoke.designpattern.factorypattern.factory;

public class OfficeParserFactory {

    public static IOfficeParser getParser(String filePath) throws Exception {
        String fileExtension = getFileExtension(filePath);
        IOfficeParserFactory parserFactory = OfficeParserFactoryMap.getOfficeParseFactory(fileExtension);
        if(parserFactory == null){
            throw new Exception("file is not supported:"+fileExtension);
        }
        IOfficeParser parser = parserFactory.createParser();
        return parser;
    }

    private static String getFileExtension(String filePath){
        // 解析文件名获取文件扩展名,比如 文档.docx，返回 docx
        String fileExtension = filePath.substring(filePath.lastIndexOf(".")+1);
        return fileExtension;
    }
}
