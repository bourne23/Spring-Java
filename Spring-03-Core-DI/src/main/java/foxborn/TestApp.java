package foxborn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
   // create container
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
    // get java class  with @Component
        Java java = container.getBean(Java.class);
//call method
        java.getTeachingHours();
    }
}
