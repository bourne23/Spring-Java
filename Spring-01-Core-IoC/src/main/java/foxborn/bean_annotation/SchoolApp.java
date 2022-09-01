package foxborn.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolApp {
    public static void main(String[] args) {
     // define configuration method, and pass config class with beans (can be more than one)
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        // create object of bean class from container
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

       // PartTimeMentor pt = container.getBean("p2",PartTimeMentor.class);
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);


// now I can call methods from my beans classes
        ft.createAccount();
        pt.createAccount();

//from configAny beans
        String str = container.getBean(String.class);
        System.out.println(str);

        Integer num = container.getBean(Integer.class);
        System.out.println(num);









    }
}
