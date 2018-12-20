package com.bwei.androi_zhangxiaokang20181220.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.bwei.androi_zhangxiaokang20181220.R;
import com.bwei.androi_zhangxiaokang20181220.adapter.GridAdapter;
import com.bwei.androi_zhangxiaokang20181220.adapter.ListViewAdapter;
import com.bwei.androi_zhangxiaokang20181220.bean.Grid;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private List<Grid> gridList=new ArrayList<>();
    private List<Grid> listview_list=new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        gridImage();
        GridAdapter gridAdapter=new GridAdapter(gridList,this);
        gridView.setAdapter(gridAdapter);
        ListViewAdapter listViewAdapter=new ListViewAdapter(listview_list,this);
        listView.setAdapter(listViewAdapter);
    }

    private void gridImage() {
        gridList.add(new Grid(R.drawable.a));
        gridList.add(new Grid(R.drawable.b));
        gridList.add(new Grid(R.drawable.c));
        gridList.add(new Grid(R.drawable.d));
        gridList.add(new Grid(R.drawable.e));
        gridList.add(new Grid(R.drawable.f));
        gridList.add(new Grid(R.drawable.g));
        gridList.add(new Grid(R.drawable.j));
        gridList.add(new Grid(R.drawable.h));
        gridList.add(new Grid(R.drawable.k));
        gridList.add(new Grid(R.drawable.l));
        listview_list.add(new Grid(R.drawable.tu));
    }

    private void initView() {
        listView = findViewById(R.id.list_view);
        gridView = findViewById(R.id.grid_view);
    }
}
