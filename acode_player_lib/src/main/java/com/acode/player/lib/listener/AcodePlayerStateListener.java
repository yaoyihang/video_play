package com.acode.player.lib.listener;


import com.acode.player.lib.bean.PlayerBean;

/**
 * user:yaoyh
 * date:2018/4/261348
 * email:345709209@qq.com
 */
public interface AcodePlayerStateListener {

    /**
     * 播放中
     *
     * @param playerBean 当前播放视频实体
     */
    void playerRuning(PlayerBean playerBean);
}
