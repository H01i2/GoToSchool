package com.example.project1.Fragment;

import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.project1.R;
import com.example.project1.Role.Role;

import androidx.fragment.app.Fragment;



    /*点击头像->信息界面*/



public class InfoFragment extends Fragment {
    private Role role;

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

    ClipDrawable high=new ClipDrawable(new ColorDrawable(Color.rgb(107,149,90)), Gravity.LEFT, ClipDrawable.HORIZONTAL);
    ClipDrawable medium_high=new ClipDrawable(new ColorDrawable(Color.rgb(20,150,219)),Gravity.LEFT,ClipDrawable.HORIZONTAL);
    ClipDrawable medium_low=new ClipDrawable(new ColorDrawable(Color.rgb(255,201,14)),Gravity.LEFT,ClipDrawable.HORIZONTAL);
    ClipDrawable low=new ClipDrawable(new ColorDrawable(Color.rgb(255,127,39)),Gravity.LEFT,ClipDrawable.HORIZONTAL);

    public InfoFragment(Role role) {
        this.role = role;
    }

    @Override
    /*加载布局文件然后直接返回，显示在Activity*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View v=inflater.inflate(R.layout.info_fragment,container,false);
        tv_Value_Energy = v.findViewById(R.id.tv_value_energy);
        tv_Value_Health = v.findViewById(R.id.tv_value_health);
        tv_Value_IQ = v.findViewById(R.id.tv_value_iQ);
        tv_Value_EQ = v.findViewById(R.id.tv_value_eQ);
        tv_Value_Mood = v.findViewById(R.id.tv_value_mood);

        pb_Energy = v.findViewById(R.id.pb_energy);
        pb_Health = v.findViewById(R.id.pb_health);
        pb_IQ = v.findViewById(R.id.pb_iQ);
        pb_EQ = v.findViewById(R.id.pb_eQ);
        pb_Mood = v.findViewById(R.id.pb_mood);

        tv_Value_Energy.setText(Integer.toString(role.getHP()));
        tv_Value_Health.setText(Integer.toString(role.getHealth()));
        tv_Value_EQ.setText(Integer.toString(role.getEQ()));
        tv_Value_IQ.setText(Integer.toString(role.getIQ()));
        tv_Value_Mood.setText(Integer.toString(role.getMood()));


//        if (role.getHP()>=80){
//            pb_Energy.setProgressDrawable(high);
//        }else if (role.getHP()>=60){
//            pb_Energy.setProgressDrawable(medium_high);
//        }else if (role.getHP()>=40){
//            pb_Energy.setProgressDrawable(medium_low);
//        }else if(role.getHP()<40){
//            pb_Energy.setProgressDrawable(low);
//        }

//        if (role.getHealth()>=80){
//            pb_Health.setProgressDrawable(high);
//        }else if (role.getHealth()>=60){
//            pb_Health.setProgressDrawable(medium_high);
//        }else if (role.getHealth()>=40){
//            pb_Health.setProgressDrawable(medium_low);
//        }else if(role.getHealth()<40){
//            pb_Health.setProgressDrawable(low);
//        }
//
//        if (role.getEQ()>=80){
//            pb_EQ.setProgressDrawable(high);
//        }else if (role.getEQ()>=60){
//            pb_EQ.setProgressDrawable(medium_high);
//        }else if (role.getEQ()>=40){
//            pb_EQ.setProgressDrawable(medium_low);
//        }else if(role.getEQ()<40){
//            pb_EQ.setProgressDrawable(low);
//        }

//        if (role.getIQ()>=80){
//            pb_IQ.setProgressDrawable(high);
//        }else if (role.getIQ()>=60){
//            pb_IQ.setProgressDrawable(medium_high);
//        }else if (role.getIQ()>=40){
//            pb_IQ.setProgressDrawable(medium_low);
//        }else if(role.getIQ()<40){
//            pb_IQ.setProgressDrawable(low);
//        }

//        if (role.getMood()>=80){
//            pb_Mood.setProgressDrawable(high);
//        }else if (role.getMood()>=60){
//            pb_Mood.setProgressDrawable(medium_high);
//        }else if (role.getMood()>=40){
//            pb_Mood.setProgressDrawable(medium_low);
//        }else if(role.getMood()<40){
//            pb_Mood.setProgressDrawable(low);
//        }

        pb_Energy.setProgress(role.getHP());
        pb_Health.setProgress(role.getHealth());
        pb_EQ.setProgress(role.getEQ());
        pb_IQ.setProgress(role.getIQ());
        pb_Mood.setProgress(role.getMood());

        return v;
    }


}
