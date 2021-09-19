package com.itcoke.designpattern.flyweight.edittext.flyweight;

public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }

    @Override
    public String toString() {
        return String.valueOf(c);
    }
}
