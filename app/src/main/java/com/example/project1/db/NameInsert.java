package com.example.project1.db;

public class NameInsert {
    public void NameInsert(){
        Name name1 = new Name();
        name1.setFamilyName("黎");
        name1.setName("海亮");
        name1.save();

        Name name2 = new Name();
        name2.setFamilyName("徐");
        name2.setName("浩");
        name2.save();

        Name name3 = new Name();
        name3.setFamilyName("廖");
        name3.setName("宇轩");
        name3.save();

    }
}
