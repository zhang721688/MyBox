package com.zxning.library.entity;

/**
 * Created by zhouweilong on 15/12/14.
 */
public class ItemInfo {
    private String name;
    private boolean isSelected;

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
