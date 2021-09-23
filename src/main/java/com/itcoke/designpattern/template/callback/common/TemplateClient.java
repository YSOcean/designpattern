package com.itcoke.designpattern.template.callback.common;

public class TemplateClient {
    public static void main(String[] args) {
        Template template = new Template();
        applyTemplate(template);
    }

    public static void applyTemplate(Template template) {
        Callback callback = new SubCallback();
        template.templateMethod(callback);
    }
}
