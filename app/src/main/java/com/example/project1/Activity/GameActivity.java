package com.example.project1.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project1.Fragment.InfoFragment;
import com.example.project1.Fragment.LifeFragment;
import com.example.project1.Fragment.MenuFragment;
import com.example.project1.R;
import com.example.project1.Fragment.RltvFragment;
import com.example.project1.Fragment.StudyFragment;
import com.example.project1.Role.Role;
import com.example.project1.Role.SharedHelper;
import com.example.project1.db.getDB;

import java.util.Map;


public class GameActivity extends FragmentActivity implements OnClickListener {
    private long mExitTime;

    private ImageView iv_head;

    private ProgressBar pb_Energy;
    private ProgressBar pb_Health;
    private ProgressBar pb_IQ;
    private ProgressBar pb_EQ;
    private ProgressBar pb_Mood;

    private TextView tv_name;
    private TextView tv_age;
    public static TextView tv_money;
    private TextView tv_time;
    private TextView tv_Value_Energy;
    private TextView tv_Value_Health;
    private TextView tv_Value_IQ;
    private TextView tv_Value_EQ;
    private TextView tv_Value_Mood;

    private Button btn_Study;
    private Button btn_Life;
    private Button btn_Rltv;
    private Button btn_Next;
    private Button btn_Menu;

    private Fragment study, life, rltv, info, menu;
    private FragmentManager manager;
    private FragmentTransaction transaction;

    private static Role role=null;

    public static Role getRole() {
        return role;
    }

    public static void setRole(Role role) {
        GameActivity.role = role;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_game);
        /**
         * 拿到事务管理器并开启事务
         */
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();

        iv_head = findViewById(R.id.iv_head);

        btn_Next = findViewById(R.id.btn_next);
        btn_Menu = findViewById(R.id.btn_menu);


        pb_Energy = findViewById(R.id.pb_energy);
        pb_Health = findViewById(R.id.pb_health);
        pb_IQ = findViewById(R.id.pb_iQ);
        pb_EQ = findViewById(R.id.pb_eQ);
        pb_Mood = findViewById(R.id.pb_mood);

        tv_name=findViewById(R.id.tv_name);
        tv_age=findViewById(R.id.tv_age);
        tv_money=findViewById(R.id.tv_money);
        tv_time=findViewById(R.id.tv_time);

        tv_Value_Energy = findViewById(R.id.tv_value_energy);
        tv_Value_Health = findViewById(R.id.tv_value_health);
        tv_Value_IQ = findViewById(R.id.tv_value_iQ);
        tv_Value_EQ = findViewById(R.id.tv_value_eQ);
        tv_Value_Mood = findViewById(R.id.tv_value_mood);


        btn_Study = findViewById(R.id.btn_study);
        btn_Life = findViewById(R.id.btn_life);
        btn_Rltv = findViewById(R.id.btn_rltv);
        btn_Next = findViewById(R.id.btn_next);

        btn_Life.setOnClickListener(this);
        btn_Study.setOnClickListener(this);
        btn_Rltv.setOnClickListener(this);
        iv_head.setOnClickListener(this);
        btn_Menu.setOnClickListener(this);
        btn_Next.setOnClickListener(this);


        /**
         * 启动默认选中第一个Fragment
         */

        study = new StudyFragment();
        transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, study);
        transaction.commit();
        initial();
    }

    /*
     *初始化数据
     */
    public void initial(){
        Intent it=getIntent();
        getDB db = new getDB();
        String key=it.getStringExtra("key");
        role=new Role();
        if(key!=null) {
            switch (key) {
                case "start":   //新的游戏
                    role = new Role(db.getName(), 6, 0, 100, 100, (int) (Math.random() *(30-1)+1),
                            (int) (Math.random()*(30-1)+1), 50, 9, "小学",0);
                    break;
                case "continue":    //继续游戏
                    Map<String, String> data;
                    data=new SharedHelper(getApplicationContext()).read();
                    role.setName(data.get("name"));
                    role.setYear(Integer.parseInt(data.get("year")));
                    role.setMoney(Integer.parseInt(data.get("money")));
                    role.setHP(Integer.parseInt(data.get("HP")));
                    role.setHealth(Integer.parseInt(data.get("health")));
                    role.setEQ(Integer.parseInt(data.get("EQ")));
                    role.setIQ(Integer.parseInt(data.get("IQ")));
                    role.setMood(Integer.parseInt(data.get("mood")));
                    role.setMonth(Integer.parseInt(data.get("month")));
                    role.setSchool(data.get("school").toString());
                    role.setNj(Integer.parseInt(data.get("nj")));
                    break;
            }
        }
        tv_name.setText(role.getName());
        tv_age.setText(Integer.toString(role.getYear()));
        tv_money.setText(Integer.toString(role.getMoney()));
        tv_time.setText(role.getMonth()+"月 "+role.getSchool()+role.getNianji()[role.getNj()]);
    }

    /*
     * 去除所有的Fragment
     * */
    public void hideFragment(FragmentTransaction transaction) {
        if (study != null) {
            transaction.remove(study);
        }
        if (life != null) {
            transaction.remove(life);
        }
        if (rltv != null) {
            transaction.remove(rltv);
        }
        if (info != null) {
            transaction.remove(info);
        }
        if (menu != null) {
            transaction.remove(menu);
        }
    }

    @Override
    public void onClick(View v) {
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();

        switch (v.getId()) {
            case R.id.btn_study:
                hideFragment(transaction);
                study = new StudyFragment();
                transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                        R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, study);
                transaction.commit();
                break;

            case R.id.btn_life:
                hideFragment(transaction);
                life = new LifeFragment();
                transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                        R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, life);
                transaction.commit();
                break;

            case R.id.btn_rltv:
                hideFragment(transaction);
                rltv = new RltvFragment();
                transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                        R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, rltv);
                transaction.commit();
                break;

            case R.id.iv_head:
                hideFragment(transaction);
                info = new InfoFragment(role);
                transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                        R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, info);
                transaction.commit();
                break;

            case R.id.btn_menu:
                hideFragment(transaction);
                menu = new MenuFragment(role);
                transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                        R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, menu);
                transaction.commit();
                break;
            case R.id.btn_next:
                next_month();
                break;
            default:
                break;
        }
    }


    public void next_month(){
        role.setMonth(role.getMonth()+1);
        int month=role.getMonth();
        int year=role.getYear();
        if(month>12){
            role.setMonth(1);
            month++;
            role.setYear(year+1);
            year++;
        }
        if (month==9){
            String text=null;
            switch (year){
                case 12:
                    text="你上初中了";
                    role.setSchool("初中");
                    role.setNj(0);
                    break;
                case 15:
                    text="你上高中了";
                    role.setSchool("高中");
                    role.setNj(0);
                    break;
                case 18:
                    text="你上大学了";
                    role.setSchool("大学");
                    role.setNj(0);
                    break;
                case 22:
                    text="你的学生时代已经结束，面对着新的生活你感到了迷茫";
                    AlertDialog.Builder quit= new AlertDialog.Builder(this);
                    quit.setMessage("游戏结束！");
                    quit.setPositiveButton("返回主菜单", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            android.os.Process.killProcess(android.os.Process.myPid());
                        }
                    });
                    AlertDialog quit_1=quit.create();
                    quit_1.show();
                    break;
                default:
                    text=null;
                    role.setNj(role.getNj()+1);
                    break;
            }
            if(text!=null)
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }
        if(month==1||month==2||month==7||month==8){
            Toast.makeText(this, "假期", Toast.LENGTH_SHORT).show();
        }
        tv_age.setText(role.getYear()+"");
        tv_time.setText(role.getMonth()+"月 "+role.getSchool()+role.getNianji()[role.getNj()]);
        SharedHelper s=new SharedHelper(getApplicationContext());           //实时保存
        s.save(role);
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                Object mHelperUtils;
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();

            } else {
                moveTaskToBack(true);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}




