package com.itcoke.designpattern.flyweight.edittext;

/**
 * 单个文字对象
 */
public class Character {
    // 字符
    private char c;
    // 字体型号
    private String font;
    // 字体大小
    private int size;
    // 字体颜色
    private int colorRGB;

    public Character(char c, String font, int size, int colorRGB){
        this.c = c;
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public String toString() {
        return String.valueOf(c);
    }
}
