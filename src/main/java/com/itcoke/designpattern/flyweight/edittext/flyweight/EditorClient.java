package com.itcoke.designpattern.flyweight.edittext.flyweight;


public class EditorClient {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.appendCharacter('A',"宋体",11,0XFFB6C1);
        editor.appendCharacter('B',"宋体",11,0XFFB6C1);
        editor.appendCharacter('C',"宋体",11,0XFFB6C1);
        editor.display();
    }

}
