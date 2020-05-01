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

        Name name4 = new Name();
        name4.setFamilyName("吕");
        name4.setName("振华");
        name4.save();

        Name name5 = new Name();
        name5.setFamilyName("梁");
        name5.setName("勇镜");
        name5.save();

        Name name6 = new Name();
        name6.setFamilyName("颜");
        name6.setName("犬明");
        name6.save();

        Name name7 = new Name();
        name7.setFamilyName("李");
        name7.setName("述堂");
        name7.save();

    }
}
