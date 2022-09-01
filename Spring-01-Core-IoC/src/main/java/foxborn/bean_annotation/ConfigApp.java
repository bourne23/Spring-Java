package foxborn.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
//create a method that returns an instance of an object that i want to add to container as bean
    // and add @Bean annotation
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }  //return instance of fulltimementor obj



   /* (1) if two of the same beans are contained in container I need to indicate
     which one i want to use in App, by adding  @Bean(name = "p1")
    and then instantiate with PartTimeMentor pt = container.getBean("p2",PartTimeMentor.class);
  */
    // @Bean(name = "p1")
    @Bean
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    /* (2) Another way is to indicate with @Primary
    */
//    @Bean(name = "p2")
    @Bean
    @Primary
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }

//1. create container
    // create config




}
