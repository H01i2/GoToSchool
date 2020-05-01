package com.example.project1.Fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.project1.Activity.GameActivity;
import com.example.project1.Activity.MainActivity;
import com.example.project1.R;
import com.example.project1.Role.Role;
import com.example.project1.db.getDB;
import com.example.project1.display;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



    /*学习界面*/



public class StudyFragment extends Fragment {
    private String[] st_Study = new String[]{"努力学习","课后复习","图书馆","食堂","操场","逃课"};//动作
    private int[] im_Study = new int[]{R.drawable.study_hard,R.drawable.review,R.drawable.library,//图标
                R.drawable.canteen,R.drawable.playground,R.drawable.skip_class};
    private ArrayList<Map<String, Object>> data_Study = new ArrayList<Map<String, Object>>();
    private ListView lv_Study;
    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.study_fragment,container,false);
        lv_Study =(ListView) view.findViewById(R.id.lv_study);
        for (int i = 0 ;  i < st_Study.length ; i++ ){
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("st_Study",st_Study[i]);
            item.put("im_Study",im_Study[i]);
            data_Study.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),data_Study,R.layout.study_list_items,new String[]{"st_Study","im_Study"},
                new int[]{R.id.tv_study_list,R.id.iv_study_list});
        lv_Study.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final GameActivity ga = new GameActivity();
                final getDB DB = new getDB();
                display d = new display(getActivity());
                if(id==0){          //点击努力学习时
                    DB.setName("认真学习");
                    DB.getDB();
                    d.dialog(DB,DB.EventsNum(),ga.getRole());
                }else if(id==1) {
                    DB.setName("课后复习");
                    DB.getDB();
                    d.dialog(DB,DB.EventsNum(),ga.getRole());
                }else if(id==2) {
                    DB.setName("图书馆");
                    DB.getDB();
                    d.dialog(DB,DB.EventsNum(),ga.getRole());
                }else if(id==3) {   //点击食堂时进入CanteenFragment
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new CanteenFragment()).commit();
                }
            }
        });

        lv_Study.setAdapter(adapter);
        return view;

    }

//    public void dialog(final getDB DB, int EventsNum) {
//        final GameActivity ga = new GameActivity();
//        if (EventsNum==1){
//            AlertDialog.Builder Events = new AlertDialog.Builder(getActivity());
//            Events.setTitle("事件")
//                    .setMessage(DB.getEvent())
//                    .setNegativeButton(DB.getOptionT().get(0), new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            DB.setNUM(ga.getRole(),1);
//                            displayText();
//                        }
//                    });
//            Events.show();
//        }else if(EventsNum==2){
//            AlertDialog.Builder Events = new AlertDialog.Builder(getActivity());
//            Events.setTitle("事件");
//            Events.setMessage(DB.getEvent());
//            Events.setPositiveButton(DB.getOptionT().get(0), new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    DB.setNUM(ga.getRole(),1);
//                    displayText();
//                }
//            });
//            Events.setNegativeButton(DB.getOptionT().get(1), new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    DB.setNUM(ga.getRole(),2);
//                    displayText();
//                }
//            });
//            Events.show();
//        }else if (EventsNum==3){
//            AlertDialog.Builder Events = new AlertDialog.Builder(getActivity());
//            Events.setTitle("事件");
//            Events.setMessage(DB.getEvent());
//            Events.setPositiveButton(DB.getOptionT().get(0), new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    DB.setNUM(ga.getRole(),1);
//                    displayText();
//                }
//            });
//            Events.setNegativeButton(DB.getOptionT().get(1), new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    DB.setNUM(ga.getRole(),2);
//                    displayText();
//                }
//            });
//            Events.setNeutralButton(DB.getOptionT().get(2), new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    DB.setNUM(ga.getRole(),3);
//                    displayText();
//                }
//            });
//            Events.show();
//        }
//
//    }
//
//    private void displayText() {
//    }

}
