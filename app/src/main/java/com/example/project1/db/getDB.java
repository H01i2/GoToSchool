package com.example.project1.db;

import com.example.project1.Role.Role;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class getDB {
    private String Event;               //存事件名
    private String OptionText;          //存选项名
    private int[] OptionInt;            //存选项值
    private Events events;              //事件存储
    private String name ;               //用于事件判断
    private String getOption1;
    private String getOption2;
    private String getOption3;

    private List<String> OptionT = new ArrayList<>();
    private List<int[]> OptionI = new ArrayList<>();


    public String getEvent() {
        return Event;
    }

    public String getOptionText() {
        return OptionText;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOptionT() {
        return OptionT;
    }

    public List<int[]> getOptionI() {
        return OptionI;
    }



    public void getDB() {
        List<Events> ev = LitePal.where("action=?", name).find(Events.class);  //查找合适的数据存放到列表ev
        Random random = new Random();                                                      //随机对象创建
        int num = random.nextInt(ev.size());                                               //num存储随机的数字
        events = ev.get(num);                                                              //从列表中查找随机选出的事件存到events
        Event = events.getEvents();                                                        //将事件存到Event
        EventsNum();

    }

    public String getName(){
        List<Name> n = LitePal.findAll(Name.class);
        Random random = new Random();
        int num = random.nextInt(n.size());
        Name nm = n.get(num);
        String familyName = nm.getFamilyName();

        Random random2 = new Random();
        int num2 = random2.nextInt(n.size());
        Name nm2 = n.get(num2);
        String name = nm2.getName();

        String nameName = familyName+name;

        return nameName;


    }


    //设置修改过的值到对象
    public void setNUM(Role role, int optionCode) {
        //精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        //optionCode判断按钮选择
        if(optionCode==1){
            role.setHP(role.getHP() + (OptionI.get(0))[0]);
            role.setHealth(role.getHealth() + (OptionI.get(0))[1]);
            role.setEQ(role.getEQ() + (OptionI.get(0))[2]);
            role.setIQ(role.getIQ() + (OptionI.get(0))[3]);
            role.setMood(role.getMood() + (OptionI.get(0))[4]);
            role.setMoney(role.getMoney() + (OptionI.get(0))[5]);
        }
        if(optionCode==2){
            role.setHP(role.getHP() + (OptionI.get(1))[0]);
            role.setHealth(role.getHealth() + (OptionI.get(1))[1]);
            role.setEQ(role.getEQ() + (OptionI.get(1))[2]);
            role.setIQ(role.getIQ() + (OptionI.get(1))[3]);
            role.setMood(role.getMood() + (OptionI.get(1))[4]);
            role.setMoney(role.getMoney() + (OptionI.get(1))[5]);
        }
        if(optionCode==3){
            role.setHP(role.getHP() + (OptionI.get(2))[0]);
            role.setHealth(role.getHealth() + (OptionI.get(2))[1]);
            role.setEQ(role.getEQ() + (OptionI.get(2))[2]);
            role.setIQ(role.getIQ() + (OptionI.get(2))[3]);
            role.setMood(role.getMood() + (OptionI.get(2))[4]);
            role.setMoney(role.getMoney() + (OptionI.get(2))[5]);
        }
    }

    //分离分离选项名和选项值
    public void split(String getOption) {
        String[] OptionSplit = getOption.split(";");                          //分离选项名和选项值
        OptionText = OptionSplit[0];                                                 //选项名存入OptionText
        String[] OptionToArray = OptionSplit[1].split(",");                   //将选项值转化为String数组
        OptionInt = new int[OptionToArray.length];                                   //创建int数组存放选项值
        //将String数组转化为int数组
        for (int i = 0; i < OptionToArray.length; i++) {
            OptionInt[i] = Integer.parseInt(OptionToArray[i]);
        }
        OptionT.add(OptionText);
        OptionI.add(OptionInt);
    }

    //设置返回值判断弹出选项个数
    public int EventsNum(){
        getOption1 = events.getOption1();
        getOption2 = events.getOption2();
        getOption3 = events.getOption3();
        int returnNum = 0;

        if (!(getOption1==null||getOption1.isEmpty())){
            split(getOption1);
            returnNum=1;
        }
        if (!(getOption2==null||getOption2.isEmpty())){
            split(getOption2);
            returnNum=2;
        }
        if (!(getOption3==null||getOption3.isEmpty())){
            split(getOption3);
            returnNum=3;
        }
        return returnNum;
    }
}
