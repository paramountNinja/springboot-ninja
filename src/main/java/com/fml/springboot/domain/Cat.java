package com.fml.springboot.domain;

import com.fml.springboot.annotation.Seven;

public class Cat {
    @Seven(name = "辛巴", sex = "女")
    private String name;

    private String Property;

    private String sex;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Seven(property = "小奶音")
    public String getProperty() {
        return Property;
    }

    public void setProperty(String property) {
        Property = property;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        System.out.println(cat.getProperty());
    }
}
