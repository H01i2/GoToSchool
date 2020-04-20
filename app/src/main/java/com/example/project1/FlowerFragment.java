package com.example.project1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlowerFragment extends Fragment {
    private String[] st_Flower = new String[]{"玫瑰","康乃馨","返回"};
    private int[] im_Flower = new int[]{R.drawable.rose,R.drawable.carnation,R.drawable.back};
    private ArrayList<Map<String, Object>> data_Flower = new ArrayList<Map<String, Object>>();
    private ListView lv_Flower;
    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.flower_fragment,container,false);
        lv_Flower = (ListView) view.findViewById(R.id.lv_flower);
        for (int i = 0 ;  i < st_Flower.length ; i++ ){
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("st_Flower",st_Flower[i]);
            item.put("im_Flower",im_Flower[i]);
            data_Flower.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),data_Flower,R.layout.flower_list_items,new String[]{"st_Flower","im_Flower"},
                new int[]{R.id.tv_flower_list,R.id.iv_flower_list});
        lv_Flower.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){
                    Toast.makeText(getActivity(), "你tm单身买尼玛玫瑰", Toast.LENGTH_LONG).show();
                }else if(id==1) {
                    Toast.makeText(getActivity(), "廖宇轩加油", Toast.LENGTH_LONG).show();
                }else if(id==2){
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new MarketFragment()).commit();
                }
            }
        });

        lv_Flower.setAdapter(adapter);
        return view;
    }
}
