package com.example.project1.Activity;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;

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


public class GameActivity extends FragmentActivity implements OnClickListener {
    private long mExitTime;

    private ImageView iv_head;

    private ProgressBar pb_Energy;
    private ProgressBar pb_Health;
    private ProgressBar pb_IQ;
    private ProgressBar pb_EQ;
    private ProgressBar pb_Mood;

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

        tv_Value_Energy = findViewById(R.id.tv_value_energy);
        tv_Value_Health = findViewById(R.id.tv_value_health);
        tv_Value_IQ = findViewById(R.id.tv_value_iQ);
        tv_Value_EQ = findViewById(R.id.tv_value_eQ);
        tv_Value_Mood = findViewById(R.id.tv_value_mood);


        btn_Study = findViewById(R.id.btn_study);
        btn_Life = findViewById(R.id.btn_life);
        btn_Rltv = findViewById(R.id.btn_rltv);

        btn_Life.setOnClickListener(this);
        btn_Study.setOnClickListener(this);
        btn_Rltv.setOnClickListener(this);
        iv_head.setOnClickListener(this);
        btn_Menu.setOnClickListener(this);

        /**
         * 启动默认选中第一个Fragment
         */

        study = new StudyFragment();
        transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, study);
        transaction.commit();


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
                info = new InfoFragment();
                transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                        R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, info);
                transaction.commit();
                break;

            case R.id.btn_menu:
                hideFragment(transaction);
                menu = new MenuFragment();
                transaction.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                        R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, menu);
                transaction.commit();
                break;


            default:
                break;
        }
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




