package s10338.configJavaCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Exam exam() {
        return new MathExam();
    }

    @Bean
    public Person radek(Exam exam) {
        return new Student(exam);
    }
}
