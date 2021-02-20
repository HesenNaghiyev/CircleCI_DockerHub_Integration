package ada.wm2.jpa.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagesConfig {

    @Bean
    public String courseWelcomeMessage() {

        return new String("Welcome to Courses' CRUD  Operations");
    }
    @Bean
    public String studentWelcomeMessage() {
        return new String("Welcome to Students' CRUD Operations ");
    }

    @Bean
    public String enrollmentWelcomeMessage() {
        return new String("Welcome to Enrollment Page");
    }

}
