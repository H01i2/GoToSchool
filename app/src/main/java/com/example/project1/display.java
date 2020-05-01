package com.example.project1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.project1.Role.Role;
import com.example.project1.db.getDB;

import androidx.appcompat.app.AlertDialog;


public class display extends View {

    public display(Context context) {
        super(context);
    }

    public void dialog(final getDB DB, int EventsNum, final Role role) {
        if (EventsNum==1){
            final AlertDialog Events = new AlertDialog.Builder(this.getContext()).create();
            Events.show();
            Window window = Events.getWindow();
            window.setContentView(R.layout.dialog_1);
            TextView dialogTitle = (TextView) window.findViewById(R.id.tv_dialog1_title);
            dialogTitle.setText("事件");
            TextView dialogContent = (TextView) window.findViewById(R.id.tv_dialog1_content);
            dialogContent.setText(DB.getEvent());
            Button btn_1 = (Button) window.findViewById(R.id.btn_dialog1_1);
            btn_1.setText(DB.getOptionT().get(0));
                btn_1.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        DB.setNUM(role,1);
                        Events.dismiss();
                    }
                });
        }else if(EventsNum==2){
            final AlertDialog Events = new AlertDialog.Builder(this.getContext()).create();
            Events.show();
            Window window = Events.getWindow();
            window.setContentView(R.layout.dialog_2);
            TextView dialogTitle = (TextView) window.findViewById(R.id.tv_dialog2_title);
            dialogTitle.setText("事件");
            TextView dialogContent = (TextView) window.findViewById(R.id.tv_dialog2_content);
            dialogContent.setText(DB.getEvent());
            Button btn_1 = (Button) window.findViewById(R.id.btn_dialog2_1);
            btn_1.setText(DB.getOptionT().get(0));
            btn_1.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    DB.setNUM(role,1);
                    Events.dismiss();
                }
            });
            Button btn_2 = (Button) window.findViewById(R.id.btn_dialog2_2);
            btn_2.setText(DB.getOptionT().get(1));
            btn_2.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    DB.setNUM(role,2);
                    Events.dismiss();
                }
            });
        }else if (EventsNum==3){
            final AlertDialog Events = new AlertDialog.Builder(this.getContext()).create();
            Events.show();
            Window window = Events.getWindow();
            window.setContentView(R.layout.dialog_3);
            TextView dialogTitle = (TextView) window.findViewById(R.id.tv_dialog3_title);
            dialogTitle.setText("事件");
            TextView dialogContent = (TextView) window.findViewById(R.id.tv_dialog3_content);
            dialogContent.setText(DB.getEvent());
            Button btn_1 = (Button) window.findViewById(R.id.btn_dialog3_1);
            btn_1.setText(DB.getOptionT().get(0));
            btn_1.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    DB.setNUM(role,1);
                    Events.dismiss();
                }
            });
            Button btn_2 = (Button) window.findViewById(R.id.btn_dialog3_2);
            btn_2.setText(DB.getOptionT().get(1));
            btn_2.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    DB.setNUM(role,2);
                    Events.dismiss();
                }
            });
            Button btn_3 = (Button) window.findViewById(R.id.btn_dialog3_3);
            btn_3.setText(DB.getOptionT().get(2));
            btn_3.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    DB.setNUM(role,3);
                    Events.dismiss();
                }
            });
        }

    }

}
