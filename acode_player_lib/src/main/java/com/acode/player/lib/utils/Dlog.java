package com.acode.player.lib.utils;

import android.util.Log;

/**
 * user:yaoyh
 * date:2018/4/261348
 * email:345709209@qq.com
 */
public class Dlog {
    public static void i(Class clazz, String msg) {
        Log.d("|acodePlayer|" + clazz.getSimpleName(), msg);
    }
}
