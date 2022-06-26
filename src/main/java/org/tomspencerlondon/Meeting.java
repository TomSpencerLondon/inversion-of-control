package org.tomspencerlondon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Meeting {
  public static void main(String[] args) {
    // Using ApplicationContext to implement Spring IoC
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

    // Get the bean
    Goodbye salutation = applicationContext.getBean("goodbye", Goodbye.class);

    // Calling the methods
    salutation.message();
  }
}
