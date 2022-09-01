package foxborn.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {

    // second config class returning an Object to be managed by spring
    @Bean
    String str(){
        return "Developer";
    }


    @Bean
    Integer number(){
        return 100;
    }
}
