package com.acode.player.lib.utils;

/**
 * user:yaoyh
 * date:2018/4/261348
 * email:345709209@qq.com
 */
public class TimeUtils {
    /**
     * 将秒数转化为时分秒
     *
     * @param time 时间段对应的秒数
     * @return 时分秒格式时间戳
     */
    public static String secToTime(int time) {
        int hour = 0;
        int minute = 0;
        int second = 0;
        if (time <= 0) {
            return "00:00";
        } else {
            if (time >= 3600) {
                hour = time / 3600;
                time = time % 3600;
            }
            if (time >= 60) {
                minute = time / 60;
                second = time % 60;
            }
            return timeFormat(hour) + ":" + timeFormat(minute) + ":" + timeFormat(second);
        }
    }

    public static String timeFormat(int num) {
        String retStr = null;
        if (num >= 0 && num < 10) {
            retStr = "0" + Integer.toString(num);
        } else {
            retStr = "" + num;
        }
        return retStr;
    }
}
