package com.example.project1.Role;

public class Role {
    private String name; //角色姓名
    private int year;    //角色年龄
    private int money;   //零花钱
    private int HP;      //精力
    private int health;  //健康值
    private int EQ;      //情商
    private int IQ;      //智商
    private int mood;    //心情
    private int month;   //月份
    private String school;  //学校
    private String[] nianji={"一年级","二年级","三年级","四年级","五年级","六年级"};
    private int nj;       //年级下标


    public Role() {
    }

    public Role(String name, int year, int money, int HP, int health, int EQ, int IQ, int mood, int month, String school,int nj) {
        this.name = name;
        this.year = year;
        this.money = money;
        this.HP = HP;
        this.health = health;
        this.EQ = EQ;
        this.IQ = IQ;
        this.mood = mood;
        this.month = month;
        this.school = school;
        this.nj = nj;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEQ() {
        return EQ;
    }

    public void setEQ(int EQ) {
        this.EQ = EQ;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String[] getNianji() {
        return nianji;
    }

    public int getNj() {
        return nj;
    }

    public void setNj(int nj) {
        this.nj = nj;
    }
}
