package org.tomspencerlondon;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
  public static void main(String[] args) {
    // Using ApplicationContext to implement Spring IoC
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

    // Get the bean
    Airtel airtel = applicationContext.getBean("airtel", Airtel.class);

    // Calling the methods
    airtel.calling();
    airtel.calling();
  }
}
