package org.example.model;

public class Course {

    private int id;
    //Example: 35

    private String name;

    private String professorName;

    private String schedule;


    //Example: "MI 07:00 08:59, VI 15:00 16:59"

    //Constructors

    //Getters y setters

    public void setId(int i) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setProfessorName(String alejandroMuñoz) {
        this.professorName = professorName;
    }
    public String getProfessorName() {
        return professorName;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    public String getSchedule() {
        return schedule;
    }




}
