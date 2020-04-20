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

public class LifeFragment extends Fragment {
    private String[] st_Life = new String[]{"回家","兼职","超市","医院","锻炼","酒吧","网吧"};
    private int[] im_Life = new int[]{R.drawable.home,R.drawable.part_time,R.drawable.market,
            R.drawable.hospital,R.drawable.exercise,R.drawable.club,R.drawable.net_bar};
    private ArrayList<Map<String, Object>> data_Life = new ArrayList<Map<String, Object>>();
    private ListView lv_Life;
    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view =  inflater.inflate(R.layout.life_fragment,container,false);
        lv_Life =(ListView) view.findViewById(R.id.lv_life);
        for (int i = 0 ;  i < st_Life.length ; i++ ){
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("st_Life",st_Life[i]);
            item.put("im_Life",im_Life[i]);
            data_Life.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),data_Life,R.layout.life_list_items,new String[]{"st_Life","im_Life"},
                new int[]{R.id.tv_life_list,R.id.iv_life_list});
        lv_Life.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new HomeFragment()).commit();
                }else if(id==1) {
                    Toast.makeText(getActivity(), "廖宇轩加油", Toast.LENGTH_LONG).show();
                }else if(id==2){
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new MarketFragment()).commit();
                }
            }
        });

        lv_Life.setAdapter(adapter);
        return view;
    }
}
