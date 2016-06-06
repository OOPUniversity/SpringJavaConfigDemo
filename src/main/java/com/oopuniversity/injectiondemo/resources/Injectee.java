package com.oopuniversity.injectiondemo.resources;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by OOP University on 6/5/2016.
 */
@Component
public class Injectee {

    @Inject
    private Injected injected;

    public void doSomething() {
        System.out.println(toString());
        System.out.println(injected.toString());
    }

    public String toString() {
        return "I am Injectee, an automatically instantiated object.";
    }
}
