package com.example.project1.db;

import org.litepal.crud.LitePalSupport;


public class Events extends LitePalSupport {
    private int id;                         //id
    private int gradeId;                    //学校阶段：1.小学 2.初中 3.高中 4.大学
    private String action;                  //活动名(如：认真学习、课后复习)
    private String events;                  //事件
    private String option1;                 //选项(组成形式："选项名;精力,健康,情商,智商,心情,零花钱,爸爸关系,妈妈关系")
    private String option2;
    private String option3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
}

