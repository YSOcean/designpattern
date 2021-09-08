package com.itcoke.designpattern.factorypattern.factory;

public class PptParserFactory implements IOfficeParserFactory {

    @Override
    public IOfficeParser createParser() {
        // TODO 进行创建对象的一些操作
        return new PptParser();
    }
}
