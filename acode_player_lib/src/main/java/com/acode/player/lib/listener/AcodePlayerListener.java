package com.acode.player.lib.listener;


import com.acode.player.lib.bean.PlayerBean;
import com.acode.player.lib.utils.GestureEnum;

/**
 * user:yaoyh
 * date:2018/4/261348
 * email:345709209@qq.com
 */
public interface AcodePlayerListener {
    /**
     * 加载中
     */
    void onLoading();

    /**
     * 准备播放
     */
    void onReady();

    /**
     * 播放中
     */
    void onPlayering(PlayerBean playerBean);

    /**
     * 播放结束
     */
    void onEnd(PlayerBean playerBean);

    /**
     * 播放异常
     * 网络
     */
    void onCatch();

    /**
     * 播放错误
     */
    void onError();

    /**
     * 调节音量回调
     */
    void onVolumes(int maxVolume, int currentVolume);

    /**
     * 调节亮度回调
     */
    void onBrightness(int maxBrightness, int currentBrightness);

    /**
     * 滑动进度回调
     */
    void onProgress(long seekTimePosition, long duration, String seekTime, String totalTime);

    /**
     * 滑动结束回调
     */
    void oEndGesture(GestureEnum state);


}
