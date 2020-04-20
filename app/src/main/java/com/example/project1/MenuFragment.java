package com.example.project1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment implements View.OnClickListener {
    private Button btn_Menuquit;
    private Button btn_Aboutus;

    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
         View view=inflater.inflate(R.layout.menu_fragment,container,false);

         btn_Menuquit = (Button) view.findViewById(R.id.btn_menuquit);
         btn_Aboutus = (Button) view.findViewById(R.id.btn_aboutus);
         btn_Menuquit.setOnClickListener(this);
         btn_Aboutus.setOnClickListener(this);
         return view;
    }
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_menuquit:
                AlertDialog.Builder quit= new AlertDialog.Builder(getActivity());
                quit.setMessage("确定不再玩一下吗！");
                quit.setPositiveButton("我好困", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        android.os.Process.killProcess(android.os.Process.myPid());
                    }
                });
                quit.setNegativeButton("继续玩", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog quit_1=quit.create();
                quit_1.show();
                break;

            case R.id.btn_aboutus:
                AlertDialog.Builder aboutus= new AlertDialog.Builder(getActivity()).setTitle("关于我们");
                aboutus.setMessage("UI设计：徐浩");
                aboutus.setIcon(R.drawable.aboutus);
                aboutus.setPositiveButton("好喔", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog aboutus_1=aboutus.create();
                aboutus_1.show();
                break;
        }

    }

}
