package org.example.repository;
import java.util.ArrayList;
import java.util.List;
import org.example.model.Student;
import org.springframework.stereotype.Repository;

@Repository //tambien podemos poner un nombre con ("nombre")
public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public StudentRepository(CourseRepository courseRepository) {
        this.students = new ArrayList<>();

    }

    public List<Student> findAll() {
        return students;
    }

    public void save(Student student) {
        students.add(student);
    }

    public boolean exists(Student student) {
        return students.contains(student);
    }



}
