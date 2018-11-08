package com.eli.dubbo.extensionloader.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * Created by elizhou on 2018/11/8.
 */
public class Man implements People {
    public Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void say(URL url) {
        System.out.println("man say");
        animal.eat(url);
    }
}
