package com.lifeix.dubbo.demo.spi;

import com.sun.tools.javac.util.ServiceLoader;

import java.util.Iterator;

/**
 * Created by zhouyilin on 2018/10/17.
 */
public class SpiTest {

    public static void main(String[] args) {
        ServiceLoader<Animal> loader = ServiceLoader.load(Animal.class);

        Iterator<Animal> iterator = loader.iterator();

        while (iterator.hasNext()) {
            Animal animal = iterator.next();

            System.out.println(animal.getClass().getName());

            animal.hello();
        }
    }
}
