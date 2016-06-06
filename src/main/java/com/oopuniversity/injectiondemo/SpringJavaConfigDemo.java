package com.oopuniversity.injectiondemo;

import com.oopuniversity.injectiondemo.resources.Injectee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by OOP University on 6/5/2016.
 */
public class SpringJavaConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.oopuniversity.injectiondemo.resources");
        ctx.refresh();

        System.out.println("I believe this is the most concise possible automatically configured and injected Spring program possible as of June 5, 2016");
        System.out.println("No configuration XML files, no configuration Java files, nothing but a properly written main application and a couple of");
        System.out.println("automatically instantiated objects, with one being injected into the other.");
        System.out.println("It took me longer than I thought it should have to figure this out, and now that I look at what's actually involved");
        System.out.println("I feel rather stupid for having had it take so long.  In my defense, searching out information on this via web searches");
        System.out.println("is a lengthy process of finding and ruling out the old, the obsolete, the misguided and the just plain wrong.");
        System.out.println("I hope this example helps someone else to avoid that pain.");
        Injectee injectee = ctx
                .getBean(Injectee.class);
        injectee.doSomething();
    }


}
