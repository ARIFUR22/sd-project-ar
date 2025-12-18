package com.example.sd_project.models;

public class Course {

    //datatypes
    private Long id;
    private String code;
    private String title;
    private Double credit;
    private String type;
    private String semester;
    private Long departmentId;
    private String teacher;

    // Default Constructor
    public Course() {
        
    }

    //  Parameterized Constructor
    public Course(Long id, String code, String title, Double credit,
                  String type, String semester, Long departmentId, String teacher) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.credit = credit;
        this.type = type;
        this.semester = semester;
        this.departmentId = departmentId;
        this.teacher = teacher;
    }
    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
