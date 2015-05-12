package com.example.administrator.commonadapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/5/12.
 */
public class ViewHolder {
    private SparseArray<View> mViews;
    private int mPosition;
    private View mConvertView;

    public ViewHolder(Context context, int position, ViewGroup parent, int layoutId) {
        this.mPosition = position;
        this.mViews = new SparseArray<View>();
        mConvertView = View.inflate(context, layoutId, null);
        mConvertView.setTag(this);
    }

    public static ViewHolder get(Context context, int position, View convertView, ViewGroup parent, int layoutId) {
        if (convertView == null) {
            return new ViewHolder(context, position, parent, layoutId);
        } else {
            ViewHolder holder = (ViewHolder) convertView.getTag();
            holder.mPosition = position;
            return holder;
        }
    }

    public View getConvertView() {
        return mConvertView;
    }

    public <T extends View> T getView(int resId) {
        View view = mViews.get(resId);
        if (view == null) {
            view = mConvertView.findViewById(resId);
            mViews.put(resId, view);
        }
        return (T) view;
    }


    public ViewHolder setText(int resId,String text){
        TextView textView = getView(resId);
        textView.setText(text);
        return this;
    }

    public ViewHolder setImageResource(int resId,int imgId){
        ImageView imageView =getView(resId);
        imageView.setImageResource(imgId);
        return this;
    }

    public ViewHolder setImageURL(int resId,String url){
        ImageView imageView = getView(resId);
     //   ImageLoader.getInstance().loadImage(iamgeView,url);
        return this;
    }

    public int getPosition() {
        return mPosition;
    }
}
