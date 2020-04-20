package com.example.project1.Role;

public class Role {
    private String name;
    private int year;
    private int money;
    private int HP;
    private int health;
    private int EQ;
    private int IQ;
    private int mood;
    private int month;

    public Role(String name, int year, int money, int HP, int health, int EQ, int IQ, int mood) {
        this.name = name;
        this.year = year;
        this.money = money;
        this.HP = HP;
        this.health = health;
        this.EQ = EQ;
        this.IQ = IQ;
        this.mood = mood;
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
}
