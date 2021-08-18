package com.swcguild.flooringmastery;

import com.swcguild.flooringmastery.controller.ControllerFM;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFM {
    
    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ControllerFM controller = ctx.getBean("controller", ControllerFM.class);
        controller.run();
    }
}
