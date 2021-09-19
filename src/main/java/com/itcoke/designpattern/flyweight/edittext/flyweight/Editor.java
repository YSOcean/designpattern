package com.itcoke.designpattern.flyweight.edittext.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, String font, int size, int colorRGB){
        Character character = new Character(c,CharacterStyleFactory.getStyle(font,size,colorRGB));
        chars.add(character);
    }

    public void display(){
        System.out.println(chars);
    }
}
