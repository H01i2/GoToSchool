package com.example.project1.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.project1.Activity.GameActivity;
import com.example.project1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        Intent intent=new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void quit(View view) {
        AlertDialog.Builder check = new AlertDialog.Builder(this);
        check.setMessage("求你了不要走！！");
        check.setPositiveButton("就要走", y_click);
        check.setNegativeButton("留下来", n_click);
        AlertDialog check_1 = check.create();
        check_1.show();
    }
    private DialogInterface.OnClickListener y_click=new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface arg0, int arg1) {
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    };
    private DialogInterface.OnClickListener n_click=new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface arg0, int arg1) {
            arg0.cancel();
        }
    };

}


