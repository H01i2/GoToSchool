package com.example.project1.Fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import com.example.project1.R;
import com.example.project1.Role.Role;
import com.example.project1.Role.SharedHelper;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;



    /*右上角菜单下的界面*/



public class MenuFragment extends Fragment implements View.OnClickListener {
    private Context mContext;

    private Button btn_Menuquit;
    private Button btn_Aboutus;
    private Button btn_Save;

    private Role role;

    public MenuFragment(Role role) {
        this.role = role;
    }

    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
         View view=inflater.inflate(R.layout.menu_fragment,container,false);

        this.mContext = getActivity();


         btn_Menuquit = (Button) view.findViewById(R.id.btn_menuquit);
         btn_Aboutus = (Button) view.findViewById(R.id.btn_aboutus);
         btn_Save=(Button) view.findViewById(R.id.btn_save);
         btn_Menuquit.setOnClickListener(this);
         btn_Aboutus.setOnClickListener(this);
         btn_Save.setOnClickListener(this);
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
                aboutus.setMessage("程序设计：黎海亮\t廖宇轩\nUI设计：徐浩");
                aboutus.setIcon(R.drawable.aboutus);
                aboutus.setPositiveButton("好喔", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog aboutus_1=aboutus.create();
                aboutus_1.show();
                break;
            case R.id.btn_save:
                SharedHelper s=new SharedHelper(getActivity().getApplicationContext());
                s.save(role);
                Toast.makeText(mContext, "保存成功", Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
