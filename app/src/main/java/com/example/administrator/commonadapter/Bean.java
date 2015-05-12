package com.example.administrator.commonadapter;

/**
 * Created by Administrator on 2015/5/12.
 */
public class Bean {
    private int icon;
    private String desc;

    //解决CheckBox错乱第一种方案：在Bean中有一个字段指定了选中状态
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public Bean(int icon, String desc) {
        this.icon = icon;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
