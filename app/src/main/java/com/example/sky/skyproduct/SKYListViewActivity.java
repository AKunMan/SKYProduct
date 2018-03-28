package com.example.sky.skyproduct;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.sky.skyproduct.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sky on 2018/2/28.
 */

public class SKYListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_sky);
//        String[] array = {"一本正经1","一本正经2","一本正经3","一本正经4","一本正经5","一本正经6"};
//        ListView list = (ListView)findViewById(R.id.lv);
//        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);
//        list.setAdapter(adp);
//
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Log.d("123213","单号哈"+i+"dada");
//            }
//        });

        ListView list_main = (ListView) findViewById(R.id.list_main);


        //2.数据源
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("logo", R.drawable.ic_launcher_background);
        map.put("title", "千千静听");
        map.put("version", "版本: 8.4.0");
        map.put("size", "大小: 32.81M");
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);




        //3. 准备适配器Adapter
        MyAdapter adapter = new MyAdapter(this);
        adapter.setList(list);

        //4. 将适配器关联到ListView
        list_main.setAdapter(adapter);
    }
}
