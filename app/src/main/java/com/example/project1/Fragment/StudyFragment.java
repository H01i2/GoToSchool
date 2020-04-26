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
                if(id==0){          //点击努力学习时
                    Toast.makeText(getActivity(), "黎海亮加油", Toast.LENGTH_LONG).show();
                }else if(id==1) {
                    Toast.makeText(getActivity(), "廖宇轩加油", Toast.LENGTH_LONG).show();
                }else if(id==2) {
                    Toast.makeText(getActivity(), "你是煞笔", Toast.LENGTH_LONG).show();
                }else if(id==3) {   //点击食堂时进入CanteenFragment
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in,R.anim.slide_right_out,
                            R.anim.slide_right_in,R.anim.slide_right_out).replace(R.id.fra_content,new CanteenFragment()).commit();
                }
            }
        });

        lv_Study.setAdapter(adapter);
        return view;

    }
}
