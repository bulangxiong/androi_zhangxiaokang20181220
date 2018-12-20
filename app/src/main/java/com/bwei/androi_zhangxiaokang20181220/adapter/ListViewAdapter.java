package com.bwei.androi_zhangxiaokang20181220.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bwei.androi_zhangxiaokang20181220.R;
import com.bwei.androi_zhangxiaokang20181220.bean.Grid;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private List<Grid> listview_list;
    private Context context;

    public ListViewAdapter(List<Grid> listview_list, Context context) {
        this.listview_list = listview_list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listview_list.size();
    }

    @Override
    public Object getItem(int position) {
        return listview_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder holder = null;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.list_layout, null);
            holder = new Viewholder();
            holder.image = convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        } else {
            holder = (Viewholder) convertView.getTag();
        }
        holder.image.setImageResource(listview_list.get(position).getImage());
        return convertView;
    }

    class Viewholder {
        ImageView image;
    }
}
