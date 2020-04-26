package com.example.project1.Fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.project1.R;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;



    /*右上角菜单类*/



public class MenuFragment extends Fragment implements View.OnClickListener {
    private Button btn_Menuquit;//返回主菜单
    private Button btn_Aboutus; //关于我们
    private Button btn_save;    //保存游戏

    @Override
    /*加载布局文件然后直接返回，显示在Activity*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
         View view=inflater.inflate(R.layout.menu_fragment,container,false);

         btn_Menuquit = (Button) view.findViewById(R.id.btn_menuquit);
         btn_Aboutus = (Button) view.findViewById(R.id.btn_aboutus);
         btn_save = (Button) view.findViewById(R.id.btn_save);
         btn_Menuquit.setOnClickListener(this);
         btn_Aboutus.setOnClickListener(this);
         btn_save.setOnClickListener(this);
         return view;
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_menuquit://返回主界面
                AlertDialog.Builder quit= new AlertDialog.Builder(getActivity());
                quit.setMessage("确定不再玩一下吗！");
                quit.setPositiveButton("我好困", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       getActivity().finish();
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

            case R.id.btn_aboutus://关于我们
                AlertDialog.Builder aboutus= new AlertDialog.Builder(getActivity()).setTitle("关于我们");
                aboutus.setMessage("UI设计：徐浩");//自己加自己上去
                aboutus.setIcon(R.drawable.aboutus);
                aboutus.setPositiveButton("好喔", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog aboutus_1=aboutus.create();
                aboutus_1.show();
                break;

            case R.id.btn_save://保存游戏

                break;
        }

    }

}
