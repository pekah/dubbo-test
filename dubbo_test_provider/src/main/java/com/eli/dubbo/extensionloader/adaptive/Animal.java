package com.eli.dubbo.extensionloader.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * Created by elizhou on 2018/11/8.
 */
@SPI
public interface Animal {
    @Adaptive(value = {"animal.type"})
    void eat(URL url);
}
