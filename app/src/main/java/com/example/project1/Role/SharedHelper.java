package com.example.project1.Role;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project1.Role.Role;

import java.util.HashMap;
import java.util.Map;
//保存数据工具类
public class SharedHelper {
    private Context mContext;

    public SharedHelper() {
    }

    public SharedHelper(Context mContext) {
        this.mContext = mContext;
    }


    //定义一个保存数据的方法
    public void save(Role role) {


        SharedPreferences sp = mContext.getSharedPreferences("data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("name",role.getName());
        editor.putInt("year",role.getYear());
        editor.putInt("money",role.getMoney());
        editor.putInt("HP",role.getHP());
        editor.putInt("health",role.getHealth());
        editor.putInt("EQ",role.getEQ());
        editor.putInt("IQ",role.getIQ());
        editor.putInt("mood",role.getMood());
        editor.putInt("month",role.getMonth());
        editor.putString("school",role.getSchool());
        editor.putInt("nj",role.getNj());
        editor.commit();
//        Toast.makeText(mContext, "保存成功", Toast.LENGTH_SHORT).show();
    }

    //定义一个读取SP文件的方法
    public Map<String, String> read() {
        Map<String, String> data = new HashMap<String, String>();
        SharedPreferences sp = mContext.getSharedPreferences("data", Context.MODE_PRIVATE);
        data.put("name",sp.getString("name",""));
        data.put("year",sp.getInt("year",-1)+"");
        data.put("money",sp.getInt("money",-1)+"");
        data.put("HP",sp.getInt("HP",-1)+"");
        data.put("health",sp.getInt("health",-1)+"");
        data.put("EQ",sp.getInt("EQ",-1)+"");
        data.put("IQ",sp.getInt("IQ",-1)+"");
        data.put("mood",sp.getInt("mood",-1)+"");
        data.put("month",sp.getInt("month",-1)+"");
        data.put("school",sp.getString("school",""));
        data.put("nj",sp.getInt("nj",-1)+"");
        return data;
    }
}
