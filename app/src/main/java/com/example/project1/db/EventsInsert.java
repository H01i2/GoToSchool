package com.example.project1.db;

public class EventsInsert {
    public void eventInsert(){
        /*认真学习*/
        Events study1 = new Events();
        study1.setGradeId(1);
        study1.setAction("认真学习");
        study1.setEvents("你按时的完成了你的作业，并且预习了明天的功课");
        study1.setOption1("真棒;-10,0,0,10,0,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        study1.setOption2("");
        study1.setOption3("");
        study1.save();

        Events study2 = new Events();
        study2.setGradeId(1);
        study2.setAction("认真学习");
        study2.setEvents("课堂上你积极回答老师问题，老师夸你真聪明");
        study2.setOption1("我是个聪明的小孩;-10,0,0,10,5,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        study2.setOption2("");
        study2.setOption3("");
        study2.save();
        /*认真学习*/

        /*课后复习*/
        Events review1 = new Events();
        review1.setGradeId(1);
        review1.setAction("课后复习");
        review1.setEvents("妈妈看见你在认真的看书，问你要喝些什么");
        review1.setOption1("牛奶;5,5,0,5,5,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        review1.setOption2("可乐;5,0,0,5,10,0,0,0");
        review1.save();

        Events review2 = new Events();
        review2.setGradeId(1);
        review2.setAction("课后复习");
        review2.setEvents("妈妈看见你在认真学习，感到很欣慰");
        review2.setOption1("我的妈妈的好孩子;-5,0,0,10,5,0,0,10");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        review2.save();
        /*课后复习*/

        /*图书馆*/
        Events library1 = new Events();
        library1.setGradeId(1);
        library1.setAction("图书馆");
        library1.setEvents("你想要看什么书呢");
        library1.setOption1("怎么与人相处;-10,0,10,0,0,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        library1.setOption2("笑话大全;-10,0,0,0,10,0,0,0");
        library1.setOption3("逻辑思维;-10,0,0,10,0,0,0,0");
        library1.save();
        /*图书馆*/

        /*操场*/
        Events playground1 = new Events();
        playground1.setGradeId(1);
        playground1.setAction("操场");
        playground1.setEvents("下课时间你和同学们一起玩躲猫猫");
        playground1.setOption1("可开心了;-15,5,0,0,10,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        playground1.save();

        Events playground2 = new Events();
        playground2.setGradeId(1);
        playground2.setAction("操场");
        playground2.setEvents("在操场玩耍忘记上课，被老师批评");
        playground2.setOption1("呜呜呜;-15,10,0,0,-10,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        playground2.save();
        /*操场*/
    }
}
