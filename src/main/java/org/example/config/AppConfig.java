package org.example.config;
import org.example.model.Course;
import org.example.model.Student;
import org.example.repository.CourseRepository;
import org.example.repository.StudentRepository;
import org.example.services.CourseService;
import org.example.services.HelloService;
import org.example.services.MessageService;
import org.example.services.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //REPO
    @Bean//+ ("alfa") es el nombre que podemos personalizar de nuestro bean
    //@Scope (Singleton) -> default
    public CourseRepository courseRepository() {
        return new CourseRepository();
    }

    @Bean
    public StudentRepository studentRepository() {
        return new StudentRepository();
    }

    //SERVICE
    @Bean(initMethod = "initializeData")
    public StudentService student(
            StudentRepository studentRepository,
            CourseRepository courseRepository) {
        return new StudentService(studentRepository, courseRepository);
    }

    @Bean
    public CourseService courseService(CourseRepository courseRepository){
        return new CourseService(courseRepository);
    }

    @Bean
    public MessageService messageService() {
        return new MessageService();
    }

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}