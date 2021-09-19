package com.itcoke.designpattern.flyweight.edittext;


import java.util.ArrayList;

/**
 * 编辑器实现
 */
public class Editor {
    private ArrayList<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, String font, int size, int colorRGB){
        Character character = new Character(c,font,size,colorRGB);
        chars.add(character);
    }

    public void display(){
        System.out.println(chars);
    }
}
