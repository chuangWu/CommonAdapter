package com.example.administrator.commonadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2015/5/12.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {
    protected Context mContext;
    protected List<T> mDatas;
    protected int mLayoutId;
    public CommonAdapter(Context context, List<T> datas,int layoutId) {
        mContext = context;
        mDatas = datas;
        mLayoutId = layoutId;
    }



    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public  View getView(int position, View convertView, ViewGroup parent){

        ViewHolder holder = ViewHolder.get(mContext, position, convertView, parent, mLayoutId);
        convert(holder,getItem(position));
        return holder.getConvertView();
    }
    public abstract void convert(ViewHolder holder ,T t);
}
