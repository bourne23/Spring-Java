package foxborn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {
  //create container
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);
 // create beans from container
        Car c = container.getBean(Car.class);
        Customer p = container.getBean(Customer.class);
  // print data from beans
        System.out.println("Customer's name : " + p.getName());
        System.out.println("Car's make : " + c.getMake());
        System.out.println("Customer's car : " + p.getCar().getMake());  // need to .setCar in person bean, and add @toString





    }
}
