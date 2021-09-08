package com.itcoke.designpattern.factorypattern.simple;

public class OfficeParserFactory {

    public static IOfficeParser getParser(String filePath) throws Exception {
        String fileExtension = getFileExtension(filePath);
        IOfficeParser parser = null;
        if("docx".equalsIgnoreCase(fileExtension)){
            parser = new WordParser(filePath);
        }else if("xlsx".equalsIgnoreCase(fileExtension)){
            parser = new ExcelParser(filePath);
        }else if("pptx".equalsIgnoreCase(fileExtension)){
            parser = new PptParser(filePath);
        }else{
            throw new Exception("file is not supported:"+fileExtension);
        }
        return parser;
    }

    private static String getFileExtension(String filePath){
        // 解析文件名获取文件扩展名,比如 文档.docx，返回 docx
        String fileExtension = filePath.substring(filePath.lastIndexOf(".")+1);
        return fileExtension;
    }
}
