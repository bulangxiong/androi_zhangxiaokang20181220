package com.bwei.androi_zhangxiaokang20181220.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bwei.androi_zhangxiaokang20181220.R;
import com.bwei.androi_zhangxiaokang20181220.bean.Grid;

import java.util.List;
import java.util.ListResourceBundle;

public class GridAdapter extends BaseAdapter {
    private List<Grid> grid_list;
    private Context context;

    public GridAdapter(List<Grid> grid_list, Context context) {
        this.grid_list = grid_list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return grid_list.size();
    }

    @Override
    public Object getItem(int position) {
        return grid_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView == null) {
            convertView=View.inflate(context, R.layout.grid_layout,null);
            holder=new ViewHolder();
            holder.image=convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        holder.image.setImageResource(grid_list.get(position).getImage());
        return convertView;
    }
    class ViewHolder{
        ImageView image;
    }
}
