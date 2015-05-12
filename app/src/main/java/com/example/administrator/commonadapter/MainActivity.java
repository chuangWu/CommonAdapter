package com.example.administrator.commonadapter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private ListView mListView;
    private ArrayList<Bean> mDatas;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        mListView = (ListView) findViewById(R.id.listview);
        mAdapter = new ListAdapter(this,mDatas,R.layout.list_item);
        mListView.setAdapter(mAdapter);
    //    mListView.setAdapter(new CommonAdapter(this,mDatas));
    }

    private void initData() {
        mDatas = new ArrayList<Bean>();
        mDatas.add(new Bean(R.drawable.img_01, "Cloud"));
        mDatas.add(new Bean(R.drawable.img_02, "Movie"));
        mDatas.add(new Bean(R.drawable.img_03, "Laptop"));
        mDatas.add(new Bean(R.drawable.img_04, "Loop"));
        mDatas.add(new Bean(R.drawable.img_05, "Menu"));
        mDatas.add(new Bean(R.drawable.img_01, "Cloud"));
        mDatas.add(new Bean(R.drawable.img_02, "Movie"));
        mDatas.add(new Bean(R.drawable.img_03, "Laptop"));
        mDatas.add(new Bean(R.drawable.img_04, "Loop"));
        mDatas.add(new Bean(R.drawable.img_05, "Menu"));
        mDatas.add(new Bean(R.drawable.img_01, "Cloud"));
        mDatas.add(new Bean(R.drawable.img_02, "Movie"));
        mDatas.add(new Bean(R.drawable.img_03, "Laptop"));
        mDatas.add(new Bean(R.drawable.img_04, "Loop"));
        mDatas.add(new Bean(R.drawable.img_05, "Menu"));
        mDatas.add(new Bean(R.drawable.img_01, "Cloud"));
        mDatas.add(new Bean(R.drawable.img_02, "Movie"));
        mDatas.add(new Bean(R.drawable.img_03, "Laptop"));
        mDatas.add(new Bean(R.drawable.img_04, "Loop"));
        mDatas.add(new Bean(R.drawable.img_05, "Menu"));
        mDatas.add(new Bean(R.drawable.img_01, "Cloud"));
        mDatas.add(new Bean(R.drawable.img_02, "Movie"));
        mDatas.add(new Bean(R.drawable.img_03, "Laptop"));
        mDatas.add(new Bean(R.drawable.img_04, "Loop"));
        mDatas.add(new Bean(R.drawable.img_05, "Menu"));
    }
}
