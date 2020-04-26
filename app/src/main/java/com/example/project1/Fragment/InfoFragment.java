package com.example.project1.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project1.R;

import androidx.fragment.app.Fragment;



    /*点击头像->信息界面*/



public class InfoFragment extends Fragment {
    @Override
    /*加载布局文件然后直接返回，显示在Activity*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        return inflater.inflate(R.layout.info_fragment,container,false);
    }
}
