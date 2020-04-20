package com.example.project1.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.project1.R;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CanteenFragment extends Fragment {
    private String[] st_Canteen = new String[]{"吃个馒头","吃顿快餐","吃顿海鲜","返回"};
    private int[] im_Canteen = new int[]{R.drawable.bun,R.drawable.fastfood,R.drawable.seafood,
            R.drawable.back};
    private ArrayList<Map<String, Object>> data_Canteen = new ArrayList<Map<String, Object>>();
    private ListView lv_Canteen;
    @Override
    /**
     * 加载布局文件然后直接返回，显示在Activity
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view=inflater.inflate(R.layout.canteen_fragment,container,false);
        lv_Canteen = (ListView) view.findViewById(R.id.lv_canteen);
        for (int i = 0 ;  i < st_Canteen.length ; i++ ){
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("st_Canteen",st_Canteen[i]);
            item.put("im_Canteen",im_Canteen[i]);
            data_Canteen.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),data_Canteen,R.layout.canteen_list_items,new String[]{"st_Canteen","im_Canteen"},
                new int[]{R.id.tv_canteen_list,R.id.iv_canteen_list});
        lv_Canteen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new StudyFragment()).commit();
                }
            }
        });

        lv_Canteen.setAdapter(adapter);
        return view;
    }
}
