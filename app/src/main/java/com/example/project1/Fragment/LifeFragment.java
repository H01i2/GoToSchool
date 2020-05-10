package com.example.project1.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.project1.Activity.GameActivity;
import com.example.project1.R;
import com.example.project1.db.getDB;
import com.example.project1.display;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/*生活界面*/


public class LifeFragment extends Fragment {
    private String[] st_Life = new String[]{"回家", "兼职", "超市", "医院", "锻炼", "酒吧", "网吧"};//地点
    private int[] im_Life = new int[]{R.drawable.home, R.drawable.part_time, R.drawable.market,//图标
            R.drawable.hospital, R.drawable.exercise, R.drawable.club, R.drawable.net_bar};
    private ArrayList<Map<String, Object>> data_Life = new ArrayList<Map<String, Object>>();
    private ListView lv_Life;

    @Override
    /*加载布局文件然后直接返回，显示在Activity*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.life_fragment, container, false);
        lv_Life = (ListView) view.findViewById(R.id.lv_life);
        for (int i = 0; i < st_Life.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("st_Life", st_Life[i]);
            item.put("im_Life", im_Life[i]);
            data_Life.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), data_Life, R.layout.life_list_items, new String[]{"st_Life", "im_Life"},
                new int[]{R.id.tv_life_list, R.id.iv_life_list});
        lv_Life.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final GameActivity ga = new GameActivity();
                final getDB DB = new getDB();
                display d = new display(getActivity());
                if (id == 0) {         //点击回家时进入HomeFragment
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                            R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, new HomeFragment()).commit();
                } else if (id == 1) {  //点击兼职时
                    DB.setName("兼职");
                    DB.getDB();
                    d.dialog(DB, DB.EventsNum(), ga.getRole());
                } else if (id == 2) {  //点击超市时
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out,
                            R.anim.slide_right_in, R.anim.slide_right_out).replace(R.id.fra_content, new MarketFragment()).commit();
                } else if (id == 3) {  //医院
                    Toast.makeText(getActivity(),"还没做好，等待更新",Toast.LENGTH_SHORT).show();
                } else if (id == 4) {  //锻炼
                    DB.setName("锻炼");
                    DB.getDB();
                    d.dialog(DB, DB.EventsNum(), ga.getRole());
                } else if (id == 5) {  //酒吧
                    DB.setName("酒吧");
                    DB.getDB();
                    d.dialog(DB, DB.EventsNum(), ga.getRole());
                } else if (id == 6) {  //网吧
                    DB.setName("网吧");
                    DB.getDB();
                    d.dialog(DB, DB.EventsNum(), ga.getRole());
                }
            }
        });

        lv_Life.setAdapter(adapter);
        return view;
    }
}
