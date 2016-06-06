package com.oopuniversity.injectiondemo.resources;

import org.springframework.stereotype.Component;

/**
 * Created by OOP University on 6/5/2016.
 */
@Component
public class Injected {
    public String toString() {
        return "I am Injected, an automatically instantiated and injected object";
    }
}
