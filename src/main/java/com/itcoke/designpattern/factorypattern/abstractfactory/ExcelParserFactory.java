package com.itcoke.designpattern.factorypattern.abstractfactory;


import com.itcoke.designpattern.factorypattern.factory.ExcelParser;
import com.itcoke.designpattern.factorypattern.factory.IOfficeParser;

public class ExcelParserFactory implements IOfficeParserFactory {

    @Override
    public IOfficeParser createParser() {
        return new ExcelParser();
    }

    @Override
    public IOldOfficeParser createOldParser() {
        return new DocParser();
    }
}
