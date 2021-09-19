package com.itcoke.designpattern.flyweight.edittext.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterStyleFactory {

    private static final Map<CharacterStyle,CharacterStyle> mapStyles = new HashMap<>();

    public static CharacterStyle getStyle(String font, int size, int colorRGB){
        CharacterStyle newStyle = new CharacterStyle(font,size,colorRGB);

        if(mapStyles.containsKey(newStyle)){
            return mapStyles.get(newStyle);
        }
        mapStyles.put(newStyle,newStyle);
        return newStyle;
    }
}
