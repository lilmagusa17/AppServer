package org.example.services;

import org.example.repository.CourseRepository;
import org.springframework.stereotype.Service;

//Es un component, pero para seguir las capas usamos:
@Service
public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

}
