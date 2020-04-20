package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class FirstActivity extends AppCompatActivity {
    private ImageView iv_Gif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

 /* 设置GIF*/
        iv_Gif = findViewById(R.id.iv_gif);
        RequestOptions options = new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
        Glide.with(this).load(R.drawable.first_start).apply(options).into(iv_Gif);

        Thread myThread=new Thread(){//创建子线程
            @Override
            public void run() {
                try{
                    sleep(6000);//使程序休眠五秒
                    Intent it=new Intent(getApplicationContext(),MainActivity.class);//启动MainActivity
                    startActivity(it);
                    finish();//关闭当前活动
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();//启动线程

    }

    }

