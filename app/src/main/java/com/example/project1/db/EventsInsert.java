package com.example.project1.db;

public class EventsInsert {
    public void eventInsert(){
    /*学习方面*/
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

        Events study3 = new Events();
        study3.setGradeId(1);
        study3.setAction("认真学习");
        study3.setEvents("遇到了不会的问题，怎么办呢？");
        study3.setOption1("不管了;0,0,0,-5,5,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        study3.setOption2("寻求老师帮助;0,0,5,5,5,0,0,0");
        study3.setOption3("自己想办法解决;-10,0,0,5,5,0,0,0");
        study3.save();

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

        Events review3 = new Events();
        review3.setGradeId(1);
        review3.setAction("课后复习");
        review3.setEvents("巩固了课堂学到的知识");
        review3.setOption1("吃点好吃的犒劳自己;5,0,0,5,5,0,0,10");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        review3.setOption2("继续预习;-5,0,0,10,0,0,0,10");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        review3.save();

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

        Events library2 = new Events();
        library2.setGradeId(1);
        library2.setAction("图书馆");
        library2.setEvents("看书看着看着睡着了");
        library2.setOption1("现在几点了？;5,0,0,0,0,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        library2.save();


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

        Events playground3 = new Events();
        playground3.setGradeId(1);
        playground3.setAction("操场");
        playground3.setEvents("在操场玩耍时摔了一跤");
        playground3.setOption1("运气太差了。;-15,-5,0,0,-10,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        playground3.save();

        /*操场*/

        /*逃课*/
        Events skipClass1 = new Events();
        skipClass1.setGradeId(1);
        skipClass1.setAction("逃课");
        skipClass1.setEvents("逃课被爸妈发现，被打了一顿");
        skipClass1.setOption1("下次不敢了。;-15,0,0,0,-10,0,-10,-10");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        skipClass1.setOption2("下次还敢。;-10,0,0,0,-10,-30,-30,-30");
        skipClass1.save();

        Events skipClass2 = new Events();
        skipClass2.setGradeId(1);
        skipClass2.setAction("逃课");
        skipClass2.setEvents("逃课去网吧玩");
        skipClass2.setOption1("舒服~;-10,-5,0,0,10,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        skipClass2.save();

        Events skipClass3 = new Events();
        skipClass3.setGradeId(1);
        skipClass3.setAction("逃课");
        skipClass3.setEvents("逃课路上捡到一块钱");
        skipClass3.setOption1("交到警察叔叔手里边。;-10,0,5,0,10,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        skipClass3.setOption2("拿去买辣条。;-10,-5,0,0,5,0,0,0");
        skipClass3.save();
        /*逃课*/
    /*学习方面*/

    /*生活方面*/
        /*回家吃饭*/
        Events goHomeToEat1 = new Events();
        goHomeToEat1.setGradeId(1);
        goHomeToEat1.setAction("回家吃饭");
        goHomeToEat1.setEvents("和爸爸妈妈一起吃饭");
        goHomeToEat1.setOption1("妈妈的做的饭菜好吃。;10,0,0,0,10,0,-5,10");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        goHomeToEat1.setOption2("爸爸的做的饭菜好吃。;10,0,0,0,10,0,10,-5");
        goHomeToEat1.setOption3("爸爸妈妈做的饭菜都好吃。;10,0,5,0,10,0,5,5");
        goHomeToEat1.save();

        Events goHomeToEat2 = new Events();
        goHomeToEat2.setGradeId(1);
        goHomeToEat2.setAction("回家吃饭");
        goHomeToEat2.setEvents("遇到自己不喜欢的饭菜");
        goHomeToEat2.setOption1("少吃一点。;5,0,0,0,0,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        goHomeToEat2.setOption2("不吃了。;0,0,-5,0,-5,0,0,0");
        goHomeToEat2.setOption3("强迫自己吃。;10,0,0,0,-5,0,0,0");
        goHomeToEat2.save();
        /*回家吃饭*/

        /*回家睡觉*/
        Events sleep1 = new Events();
        sleep1.setGradeId(1);
        sleep1.setAction("回家睡觉");
        sleep1.setEvents("困了，睡个觉吧");
        sleep1.setOption1("晚安;20,0,0,0,0,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        sleep1.save();
        /*回家睡觉*/

        /*看电视*/
        Events watchTV1 = new Events();
        watchTV1.setGradeId(1);
        watchTV1.setAction("看电视");
        watchTV1.setEvents("看会电视休闲一下，你想要看什么呢？");
        watchTV1.setOption1("动画片。;-10,0,0,0,15,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        watchTV1.setOption2("新闻。;-10,0,0,5,5,0,0,0");
        watchTV1.save();
        /*看电视*/

        /*聊天*/
        Events chat1 = new Events();
        chat1.setGradeId(1);
        chat1.setAction("聊天");
        chat1.setEvents("和爸爸妈妈聊会儿天");
        chat1.setOption1("说说今天学校的趣事;-5,0,0,0,5,0,5,5");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        chat1.setOption2("聊聊学习;-5,0,0,5,5,0,0,0");
        chat1.save();
        /*聊天*/

        /*兼职*/
        Events work1 = new Events();
        work1.setGradeId(1);
        work1.setAction("兼职");
        work1.setEvents("你还太小了，长大了再来");
        work1.setOption1("好吧;0,0,0,0,0,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        work1.save();
        /*兼职*/

        /*锻炼*/
        Events exercise1 = new Events();
        exercise1.setGradeId(1);
        exercise1.setAction("锻炼");
        exercise1.setEvents("界面没做完");
        exercise1.setOption1("好吧;0,0,0,0,0,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        exercise1.save();
        /*锻炼*/

        /*酒吧*/
        Events bar1 = new Events();
        bar1.setGradeId(1);
        bar1.setAction("酒吧");
        bar1.setEvents("你还太小了，被轰出来了");
        bar1.setOption1("好吧;0,0,0,0,0,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        bar1.save();
        /*酒吧*/

        /*网吧*/
        Events cyberbar1 = new Events();
        cyberbar1.setGradeId(1);
        cyberbar1.setAction("网吧");
        cyberbar1.setEvents("你还太小了，被轰出来了");
        cyberbar1.setOption1("好吧;0,0,0,0,-10,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        cyberbar1.save();

        Events cyberbar2 = new Events();
        cyberbar2.setGradeId(1);
        cyberbar2.setAction("网吧");
        cyberbar2.setEvents("遇见警察来检查");
        cyberbar2.setOption1("哦吼，完蛋;-10,0,0,0,-10,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        cyberbar2.save();

        Events cyberbar3 = new Events();
        cyberbar3.setGradeId(1);
        cyberbar3.setAction("网吧");
        cyberbar3.setEvents("在网吧玩了一整天。");
        cyberbar3.setOption1("真爽;-10,-10,0,0,20,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        cyberbar3.save();

        Events cyberbar4 = new Events();
        cyberbar4.setGradeId(1);
        cyberbar4.setAction("网吧");
        cyberbar4.setEvents("被爸妈抓住");
        cyberbar4.setOption1("糟糕;0,0,0,0,-5,0,-5,-5");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        cyberbar4.save();

        Events cyberbar5 = new Events();
        cyberbar5.setGradeId(1);
        cyberbar5.setAction("网吧");
        cyberbar5.setEvents("在网吧学习，享受着别人奇妙的眼光");
        cyberbar5.setOption1("我最厉害;0,0,0,5,10,0,0,0");//精力，健康，情商，智商，心情，零花钱，爸爸关系，妈妈关系
        cyberbar5.save();
        /*网吧*/

        /*生活方面*/


    }
}
