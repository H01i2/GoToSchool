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

public class MarketFragment extends Fragment {
    private String[] st_Market = new String[]{"食品","花卉","配饰","返回"};
    private int[] im_Market = new int[]{R.drawable.snack,R.drawable.flower,R.drawable.acc, R.drawable.back};
    private ArrayList<Map<String, Object>> data_Market = new ArrayList<Map<String, Object>>();
    private ListView lv_Market;
    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.market_fragment,container,false);
        lv_Market = (ListView) view.findViewById(R.id.lv_market);
        for (int i = 0 ;  i < st_Market.length ; i++ ){
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("st_Market",st_Market[i]);
            item.put("im_Market",im_Market[i]);
            data_Market.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),data_Market,R.layout.market_list_items,new String[]{"st_Market","im_Market"},
                new int[]{R.id.tv_market_list,R.id.iv_market_list});
        lv_Market.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new SnackFragment()).commit();
                }else if(id==1) {
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new FlowerFragment()).commit();
                }else if(id==2){
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new AccFragment()).commit();
                }else if(id==3){
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new LifeFragment()).commit();
                }
            }
        });

        lv_Market.setAdapter(adapter);
        return view;
    }
}
