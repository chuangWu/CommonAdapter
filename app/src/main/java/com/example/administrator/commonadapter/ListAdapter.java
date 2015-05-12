package com.example.administrator.commonadapter;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/5/12.
 */
public class ListAdapter extends CommonAdapter<Bean> {

    private List<Integer> mPos = new ArrayList<Integer>();

    public ListAdapter(Context context, List<Bean> datas, int layoutId) {
        super(context, datas, layoutId);
    }

    @Override
    public void convert(final ViewHolder holder, final Bean bean) {
        holder.setImageResource(R.id.icon, bean.getIcon());
        holder.setText(R.id.name, bean.getDesc());
        holder.setText(R.id.subname, "This position is" + bean.getDesc());

        final CheckBox checkBox = holder.getView(R.id.cb);

        //-----------第一种方法start------------------//
//        checkBox.setChecked(bean.isChecked());
//        checkBox.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bean.setChecked(checkBox.isChecked());
//            }
//        });
        //-----------第一种方法end------------------//

        //-----------第二种方法start------------------//
        checkBox.setChecked(false);
        if (mPos.contains(holder.getPosition())) {
            checkBox.setChecked(true);
        }
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked())
                    mPos.add(holder.getPosition());
                else
                    mPos.remove((Integer) holder.getPosition());
            }
        });
        //-----------第二种方法end------------------//
    }
}
