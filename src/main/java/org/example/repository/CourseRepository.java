package org.example.repository;

import java.util.ArrayList;
import java.util.List;
import org.example.model.Course;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    public List<Course> findAll() {
        return courses;
    }

    public void save(Course course) {
        courses.add(course);
    }

    public boolean exists(Course course) {
        return courses.contains(course);
    }
}