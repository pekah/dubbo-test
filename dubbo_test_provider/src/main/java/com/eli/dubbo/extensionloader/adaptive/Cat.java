package com.eli.dubbo.extensionloader.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * Created by elizhou on 2018/11/8.
 */
public class Cat implements Animal {
    public void eat(URL url) {
        System.out.println("cat eat");
    }
}
