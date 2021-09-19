package com.itcoke.designpattern.flyweight.edittext.flyweight;

import java.util.Objects;

public class CharacterStyle {
    // 字体型号
    private String font;
    // 字体大小
    private int size;
    // 字体颜色
    private int colorRGB;

    public CharacterStyle(String font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterStyle that = (CharacterStyle) o;
        return size == that.size &&
                colorRGB == that.colorRGB &&
                Objects.equals(font, that.font);
    }

    @Override
    public int hashCode() {
        return Objects.hash(font, size, colorRGB);
    }
}

