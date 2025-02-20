package org.example.services;


import org.example.model.Course;
import org.example.model.Student;
import org.example.repository.CourseRepository;
import org.example.repository.StudentRepository;

import java.util.List;

public class StudentService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }
    public void createStudent(Student student) {
        if(!studentRepository.exists(student)){
            studentRepository.save(student);

            student.getCourses().forEach(course -> {
                if(!courseRepository.exists(course)) courseRepository.save(course);
            });
        }else{
            System.out.println("Student already exists");
        }
    }

    public void initializeData(){
        var student1 = new Student();
        student1.setCode("A00111111");
        student1.setName("Andrea Rodriguez");
        student1.setProgram("Ingeniería de Sistemas");

        var student2 = new Student();
        student2.setCode("A00222222");
        student2.setName("Blanca Gutiérrez");
        student2.setProgram("Ingeniería de Sistemas");

        var student3 = new Student();
        student3.setCode("A00333333");
        student3.setName("Carlos Zapata");
        student3.setProgram("Psicología");

        var course1 = new Course();
        course1.setId(59);
        course1.setProfessorName("Alejandro Muñoz");
        course1.setName("Computación en Internet 2");
        course1.setSchedule("MA 14:00 15:59, JU 14:00 15:59");

        var course2 = new Course();
        course2.setId(23);
        course2.setProfessorName("Andres García");
        course2.setName("Comunicación oral y escrita 2");
        course2.setSchedule("MI 14:00 15:59");

        var course3 = new Course();
        course3.setId(14);
        course3.setProfessorName("Gabriel Tamura");
        course3.setName("Ingeniería de Software 4");
        course3.setSchedule("MA 07:00 08:59, JU 07:00 08:59");

        var course4 = new Course();
        course3.setId(12);
        course3.setProfessorName("Saryth Valencia");
        course3.setName("Psicología Organizacional");
        course3.setSchedule("VI 11:00 13:00");



        createStudent(student1);
        createStudent(student2);
        createStudent(student3);
    }

}
