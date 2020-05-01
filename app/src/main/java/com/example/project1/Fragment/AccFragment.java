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



/*生活->超市->配饰界面*/


public class AccFragment extends Fragment {
    private String[] st_Acc = new String[]{"帽子", "围巾", "项链", "手表", "返回"};//配饰
    private int[] im_Acc = new int[]{R.drawable.hat, R.drawable.scarf, R.drawable.necklace, R.drawable.watch, R.drawable.back};//图标
    private ArrayList<Map<String, Object>> data_Acc = new ArrayList<Map<String, Object>>();
    private ListView lv_Acc;

    @Override
    /*加载布局文件然后直接返回，显示在Activity*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.acc_fragment, container, false);
        lv_Acc = (ListView) view.findViewById(R.id.lv_acc);
        for (int i = 0; i < st_Acc.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("st_Acc", st_Acc[i]);
            item.put("im_Acc", im_Acc[i]);
            data_Acc.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), data_Acc, R.layout.acc_list_items, new String[]{"st_Acc", "im_Acc"},
                new int[]{R.id.tv_acc_list, R.id.iv_acc_list});
        lv_Acc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (id == 0) {        //点击帽子时
                    Toast.makeText(getActivity(), "你妈死了", Toast.LENGTH_LONG).show();
                } else if (id == 1) { //点击围巾时
                    Toast.makeText(getActivity(), "你妈死了", Toast.LENGTH_LONG).show();
                } else if (id == 4) { //点击返回时
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                            R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, new MarketFragment()).commit();
                }
            }
        });

        lv_Acc.setAdapter(adapter);
        return view;
    }
}
