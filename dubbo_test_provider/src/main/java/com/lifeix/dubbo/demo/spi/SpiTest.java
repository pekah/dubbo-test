package com.lifeix.dubbo.demo.spi;


import java.util.Iterator;
import java.util.ServiceLoader;

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
