package com.itcoke.designpattern.factorypattern.abstractfactory;


import com.itcoke.designpattern.factorypattern.factory.IOfficeParser;

public interface IOfficeParserFactory {

    IOfficeParser createParser();

    IOldOfficeParser createOldParser();
}
