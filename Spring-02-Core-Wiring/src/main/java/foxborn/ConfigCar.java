package foxborn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }
  // dependency injection - to inject objects car into person car, by method call - setObject
    //Direct wiring  - to create wiring, i need to set bean withing a bean  p.setCar(car());
//    @Bean
//    Customer person(){
//        Customer p = new Customer();
//        p.setName("Mike");
//        p.setCar(car());  // 1. call a method
//        return p;
//    }

    //Autowiring - pass a bean as parameter and then set it : p.setCar(car);
    @Bean
    Customer person(Car car){   // 2. or add parameter
        Customer p = new Customer();
        p.setName("Mike");
        p.setCar(car);        //2. and inject object
        return p;
    }
}
