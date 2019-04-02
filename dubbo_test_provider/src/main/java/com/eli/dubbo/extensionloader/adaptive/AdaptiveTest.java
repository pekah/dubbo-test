package com.eli.dubbo.extensionloader.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by elizhou on 2018/11/8.
 */
public class AdaptiveTest {

    public static void main(String[] args) {
        Map<String, String> parameters = new HashMap<String, String>();
//        parameters.put("animal.type", "cat");
//        parameters.put("people.type", "man");
        // 传入一个不存在的key，则使用@SPI配置的默认值对应的扩展点
        parameters.put("people.type", "");

        URL url = new URL("dubbo", "zhangsan", "lisi", "127.0.01", 2888, "default", parameters);

        ExtensionLoader.getExtensionLoader(People.class).getAdaptiveExtension().say(url);
    }
}
