package com.example.project1.Fragment;

import android.os.Bundle;
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

        pb_Energy.setProgress(role.getHP());
        pb_Health.setProgress(role.getHealth());
        pb_EQ.setProgress(role.getEQ());
        pb_IQ.setProgress(role.getIQ());
        pb_Mood.setProgress(role.getMood());

        return v;
    }


}
