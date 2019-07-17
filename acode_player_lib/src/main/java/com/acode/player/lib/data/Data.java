package com.acode.player.lib.data;

import android.net.Uri;


import com.acode.player.lib.bean.PlayerBean;

import java.util.ArrayList;

/**
 * user:yaoyh
 * date:2018/4/261348
 * email:345709209@qq.com
 */
public class Data {
    public static ArrayList<PlayerBean> getPlayerBeans() {
        ArrayList<PlayerBean> playerBeans = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            PlayerBean playerBean = new PlayerBean();
            playerBean.setUrl("");
            playerBean.setCurrentTime("00:00");
            playerBean.setEndTime("00:00");
            playerBean.setUploadProgress(0);
            if (i == 0) {
                playerBean.setTitle("小神龙");
                playerBean.setInfo("小神龙谈父亲");
                ArrayList<String> uris = new ArrayList<>();
                uris.add("https://apd-abaa206c1d5ec6f56254ad5c6007d359.v.smtcdns.com/vhot2.qqvideo.tc.qq.com/AlQ65rtY4W7stfHQR8GJY_508ojpxM-uaG-AGLaUl8-I/uwMROfz2r5zCIaQXGdGnC2dfhzk_jigLCkkLvI0zErHWpl3G/f0723oakkl6.m701.mp4?sdtfrom=v3010&guid=7a3b9a870525e07905a50936706b2b40&vkey=927E71ACA77F7A53EC74E588CB895B79C0EC2A210104864067CCB460F82EBCAABEBB42232EAEDE514724C1DFB5A6071D9675E442DD00E789200D341601557707C0EA16BB7FB61E250064B94E5AB485E9E01DD56450728805FAF8E4300E708742CD0ABD82F50FBEE93E4C15A46C037632F28360BBF3AAD16838AB9A4399025F78&platform=2");
                uris.add("https://apd-abaa206c1d5ec6f56254ad5c6007d359.v.smtcdns.com/vhot2.qqvideo.tc.qq.com/AlQ65rtY4W7stfHQR8GJY_508ojpxM-uaG-AGLaUl8-I/uwMROfz2r5zCIaQXGdGnC2dfhzk_jigLCkkLvI0zErHWpl3G/f0723oakkl6.m701.mp4?sdtfrom=v3010&guid=7a3b9a870525e07905a50936706b2b40&vkey=927E71ACA77F7A53EC74E588CB895B79C0EC2A210104864067CCB460F82EBCAABEBB42232EAEDE514724C1DFB5A6071D9675E442DD00E789200D341601557707C0EA16BB7FB61E250064B94E5AB485E9E01DD56450728805FAF8E4300E708742CD0ABD82F50FBEE93E4C15A46C037632F28360BBF3AAD16838AB9A4399025F78&platform=2");
                uris.add("https://apd-abaa206c1d5ec6f56254ad5c6007d359.v.smtcdns.com/vhot2.qqvideo.tc.qq.com/AlQ65rtY4W7stfHQR8GJY_508ojpxM-uaG-AGLaUl8-I/uwMROfz2r5zCIaQXGdGnC2dfhzk_jigLCkkLvI0zErHWpl3G/f0723oakkl6.m701.mp4?sdtfrom=v3010&guid=7a3b9a870525e07905a50936706b2b40&vkey=927E71ACA77F7A53EC74E588CB895B79C0EC2A210104864067CCB460F82EBCAABEBB42232EAEDE514724C1DFB5A6071D9675E442DD00E789200D341601557707C0EA16BB7FB61E250064B94E5AB485E9E01DD56450728805FAF8E4300E708742CD0ABD82F50FBEE93E4C15A46C037632F28360BBF3AAD16838AB9A4399025F78&platform=2");
                playerBean.setPlayerUrls(uris);
                ArrayList<String> linsNames = new ArrayList<>();
                linsNames.add("超清");
                linsNames.add("高清");
                linsNames.add("标清");
                playerBean.setLineNames(linsNames);
                playerBean.setMs(100000+System.currentTimeMillis());
            }
            if (i == 1) {
                playerBean.setTitle("烟火里的尘埃");
                playerBean.setInfo("不是华晨宇唱的烟火里的尘埃");
                ArrayList<String> uris = new ArrayList<>();
                uris.add("http://oif1jvh5f.bkt.clouddn.com/CFNetworkDownload_t3QJVZ.mp4");
                uris.add("http://oif1jvh5f.bkt.clouddn.com/CFNetworkDownload_t3QJVZ.mp4");
                uris.add("http://oif1jvh5f.bkt.clouddn.com/CFNetworkDownload_t3QJVZ.mp4");
                playerBean.setPlayerUrls(uris);
                ArrayList<String> linsNames = new ArrayList<>();
                linsNames.add("超清");
                linsNames.add("高清");
                linsNames.add("标清");
                playerBean.setLineNames(linsNames);
            }
            if (i == 2) {
                playerBean.setTitle("螳螂拳");
                playerBean.setInfo("热血像那红日光");
                ArrayList<String> uris = new ArrayList<>();
                uris.add("http://oif1jvh5f.bkt.clouddn.com/CFNetworkDownload_5Vkbz0.mp4");
                uris.add("http://oif1jvh5f.bkt.clouddn.com/CFNetworkDownload_5Vkbz0.mp4");
                uris.add("http://oif1jvh5f.bkt.clouddn.com/CFNetworkDownload_5Vkbz0.mp4");
                playerBean.setPlayerUrls(uris);
                ArrayList<String> linsNames = new ArrayList<>();
                linsNames.add("超清");
                linsNames.add("高清");
                linsNames.add("标清");
                playerBean.setLineNames(linsNames);
            }
            if (i == 3) {
                playerBean.setTitle("六一儿童节快乐");
                playerBean.setInfo("六一儿童节快乐");
                ArrayList<String> uris = new ArrayList<>();
                uris.add("http://mp4.vjshi.com/2015-05-11/1431320221859_786.mp4");
                uris.add("http://mp4.vjshi.com/2016-10-21/84bafe60ef0af95a5292f66b9f692504.mp4");
                uris.add("http://mp4.vjshi.com/2017-04-14/933db6540f53dd38974b4446388fb928.mp4");
                playerBean.setPlayerUrls(uris);
                ArrayList<String> linsNames = new ArrayList<>();
                linsNames.add("超清");
                linsNames.add("高清");
                linsNames.add("标清");
                playerBean.setLineNames(linsNames);
            }
            playerBeans.add(playerBean);
        }
        return playerBeans;
    }
}
