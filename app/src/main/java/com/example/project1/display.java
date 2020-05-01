package com.example.project1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

import com.example.project1.Activity.GameActivity;
import com.example.project1.Fragment.InfoFragment;
import com.example.project1.Role.Role;
import com.example.project1.db.getDB;

import androidx.appcompat.app.AlertDialog;


public class display extends View {

    public display(Context context) {
        super(context);
    }

    public void dialog(final getDB DB, int EventsNum, final Role role) {
        if (EventsNum==1){
            AlertDialog.Builder Events = new AlertDialog.Builder(this.getContext());
            Events.setTitle("事件")
                    .setMessage(DB.getEvent())
                    .setNegativeButton(DB.getOptionT().get(0), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            DB.setNUM(role,1);
                        }
                    });
            Events.show();
        }else if(EventsNum==2){
            AlertDialog.Builder Events = new AlertDialog.Builder(this.getContext());
            Events.setTitle("事件");
            Events.setMessage(DB.getEvent());
            Events.setPositiveButton(DB.getOptionT().get(0), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    DB.setNUM(role,1);
                }
            });
            Events.setNegativeButton(DB.getOptionT().get(1), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    DB.setNUM(role,2);
                }
            });
            Events.show();
        }else if (EventsNum==3){
            AlertDialog.Builder Events = new AlertDialog.Builder(this.getContext());
            Events.setTitle("事件");
            Events.setMessage(DB.getEvent());
            Events.setPositiveButton(DB.getOptionT().get(0), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    DB.setNUM(role,1);
                }
            });
            Events.setNegativeButton(DB.getOptionT().get(1), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    DB.setNUM(role,2);
                }
            });
            Events.setNeutralButton(DB.getOptionT().get(2), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    DB.setNUM(role,3);
                }
            });
            Events.show();
        }

    }

}
