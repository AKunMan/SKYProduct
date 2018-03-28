package com.example.sky.skyproduct.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sky.skyproduct.R;

import java.util.List;
import java.util.Map;

/**
 * Created by sky on 2018/2/28.
 */

public class MyAdapter extends BaseAdapter {
    //数据集合
    //数据集合
    List<Map<String,Object>> list;
    //反射器
    LayoutInflater inflater;

    //构造器
    public MyAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position %2 == 0 ? 0 : 1;
    }

    //实现getView方法
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("12345","-------"+position);
        ViewHolder viewHolder = null;
        ViewHodeOther viewHodeOther = null;
        //给控件赋值
        Map map = list.get(position);
        if (getItemViewType(position) == 0){
            if (convertView == null){
                viewHolder = new ViewHolder();
                convertView = inflater.inflate(R.layout.item,null);
                //获取各个控件
                viewHolder.logo = (ImageView) convertView.findViewById(R.id.logo);
                viewHolder.title = (TextView) convertView.findViewById(R.id.title);
                viewHolder.version = (TextView) convertView.findViewById(R.id.version);
                viewHolder.size = (TextView) convertView.findViewById(R.id.size);
                convertView.setTag(viewHolder);
            }else {
                viewHolder = (ViewHolder)convertView.getTag();
            }
            viewHolder.logo.setImageResource((Integer) map.get("logo"));
            viewHolder.title.setText((String) map.get("title"));
            viewHolder.version.setText((String) map.get("version"));
            viewHolder.size.setText((String) map.get("size"));
        }else {
            if (convertView == null){
                viewHodeOther = new ViewHodeOther();
                convertView = inflater.inflate(R.layout.item2,null);
                viewHodeOther.title2 = (TextView) convertView.findViewById(R.id.title2);
                convertView.setTag(viewHodeOther);
            }else{
                viewHodeOther = (ViewHodeOther)convertView.getTag();
            }
            viewHodeOther.title2.setText((String) map.get("title"));
        }
        return convertView;
    }
}

class ViewHolder{
    ImageView logo = null;
    TextView title = null;
    TextView version = null;
    TextView size = null;
}

class ViewHodeOther{
    TextView title2 = null;
}