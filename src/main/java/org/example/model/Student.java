package org.example.model;

import java.util.List;

public class Student {

    private String code;
    //Example: A00123456

    private String name;

    private String program;

    private List<Course> courses;


    //Constructors
    public Student() {

    }

    //Getters y setters
    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public List<Course> getCourses() {
        return courses;
    }


    @Override
   public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return this.code.equals(student.getCode());
        }
        return false;
    }
}
