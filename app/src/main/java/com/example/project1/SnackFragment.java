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

public class SnackFragment extends Fragment {
    private String[] st_Snack = new String[]{"可乐","薯片","水果","返回"};
    private int[] im_Snack = new int[]{R.drawable.cola,R.drawable.chips,R.drawable.fruit, R.drawable.back};
    private ArrayList<Map<String, Object>> data_Snack = new ArrayList<Map<String, Object>>();
    private ListView lv_Snack;
    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.snack_fragment,container,false);
        lv_Snack = (ListView) view.findViewById(R.id.lv_snack);
        for (int i = 0 ;  i < st_Snack.length ; i++ ){
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("st_Snack",st_Snack[i]);
            item.put("im_Snack",im_Snack[i]);
            data_Snack.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),data_Snack,R.layout.snack_list_items,new String[]{"st_Snack","im_Snack"},
                new int[]{R.id.tv_snack_list,R.id.iv_snack_list});
        lv_Snack.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){
                    Toast.makeText(getActivity(), "黎海亮加油", Toast.LENGTH_LONG).show();
                }else if(id==1) {
                    Toast.makeText(getActivity(), "廖宇轩加油", Toast.LENGTH_LONG).show();
                }else if(id==2){
                    Toast.makeText(getActivity(), "你是煞笔", Toast.LENGTH_LONG).show();
                }else if(id==3){
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new MarketFragment()).commit();
                }
            }
        });

        lv_Snack.setAdapter(adapter);
        return view;
    }
}
