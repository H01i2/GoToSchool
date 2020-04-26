package com.example.project1.Fragment;

import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.project1.R;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/*关系界面*/



public class RltvFragment extends Fragment {
    private String[] st_Rltv = new String[]{"爸爸","妈妈"};//给ListView加文字
    private int[] im_Rltv = new int[]{R.drawable.father,R.drawable.mother};//加图标，drawable里有gf（女朋友）和bf（男朋友）的图标
    private ArrayList<Map<String, Object>> data_Rltv = new ArrayList<Map<String, Object>>();
    private ListView lv_Rltv;

    @Override
    /*加载布局文件然后直接返回，显示在Activity*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view =  inflater.inflate(R.layout.rltv_fragment,container,false);
        lv_Rltv =(ListView) view.findViewById(R.id.lv_rltv);
        for (int i = 0 ;  i < st_Rltv.length ; i++ ){
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("st_Rltv",st_Rltv[i]);
            item.put("im_Rltv",im_Rltv[i]);
            data_Rltv.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),data_Rltv,R.layout.rltv_list_items,new String[]{"st_Rltv","im_Rltv"},
                new int[]{R.id.tv_rltv_list,R.id.iv_rltv_list});
        lv_Rltv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){          //点击“爸爸”时
                    Toast.makeText(getActivity(), "黎海亮加油", Toast.LENGTH_LONG).show();
                }else if(id==1) {   //点击“妈妈”
                    Toast.makeText(getActivity(), "廖宇轩加油", Toast.LENGTH_LONG).show();
                }
            }
        });

        lv_Rltv.setAdapter(adapter);
        return view;
    }
}
