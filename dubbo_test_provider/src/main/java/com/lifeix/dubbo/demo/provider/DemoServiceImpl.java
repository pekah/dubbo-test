package com.lifeix.dubbo.demo.provider;

import com.lifeix.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
