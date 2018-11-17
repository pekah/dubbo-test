package com.eli.dubbo.extensionloader.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * Created by zhouyilin on 2018/11/17.
 */
public class ManWrapper implements People {

    private final People people;

    public ManWrapper(People people) {
        this.people = people;
    }

    public void say(URL url) {
        System.out.println("I`m man wrapper");
        people.say(url);
    }
}
