package com.acode.player.lib.utils;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/**
 * user:yaoyh
 * date:2018/4/261348
 * email:345709209@qq.com
 */
public class NoScrollLinearManager extends LinearLayoutManager {
    private boolean isScrollEnabled = true;

    public NoScrollLinearManager(Context context) {
        super(context);
    }

    public void setScrollEnabled(boolean flag) {
        this.isScrollEnabled = flag;
    }

    @Override
    public boolean canScrollVertically() {
        return isScrollEnabled && super.canScrollVertically();
    }
}
