package com.eli.dubbo.extensionloader.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * Created by elizhou on 2018/11/8.
 */
public class Woman implements People {

    public void say(URL url) {
        System.out.println("woman say");
    }
}
