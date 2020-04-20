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

public class HomeFragment extends Fragment {
    private String[] st_Home = new String[]{"吃饭","睡觉","看电视","和父母聊天","返回"};
    private int[] im_Home = new int[]{R.drawable.eat,R.drawable.bed,R.drawable.tv,R.drawable.chat,
            R.drawable.back};
    private ArrayList<Map<String, Object>> data_Home = new ArrayList<Map<String, Object>>();
    private ListView lv_Home;
    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.home_fragment,container,false);
        lv_Home = (ListView) view.findViewById(R.id.lv_home);
        for (int i = 0 ;  i < st_Home.length ; i++ ){
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("st_Home",st_Home[i]);
            item.put("im_Home",im_Home[i]);
            data_Home.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),data_Home,R.layout.home_list_items,new String[]{"st_Home","im_Home"},
                new int[]{R.id.tv_home_list,R.id.iv_home_list});
        lv_Home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){
                    Toast.makeText(getActivity(), "黎海亮加油", Toast.LENGTH_LONG).show();
                }else if(id==1) {
                    Toast.makeText(getActivity(), "廖宇轩加油", Toast.LENGTH_LONG).show();
                }else if(id==2){
                    Toast.makeText(getActivity(), "你是煞笔", Toast.LENGTH_LONG).show();
                }else if(id==4){
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new LifeFragment()).commit();
                }
            }
        });

        lv_Home.setAdapter(adapter);
        return view;
    }
}
