package com.iiuc.StudentManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iiuc.StudentManagementSystem.model.CourseModels;
import com.iiuc.StudentManagementSystem.service.CourseServices;

import java.util.*;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseServices service;

    public CourseController(CourseServices service) {
        this.service = service;
    }

    @GetMapping
    public List<CourseModels> getAllCourses() {
        return service.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseModels getCourseById(@PathVariable Long id) {
        return service.getCoursesByID(id);
    }

    @PostMapping
    public String addCourse(@RequestBody CourseModels course) {
        return service.addCourse(course);
    }

    @PutMapping("/{id}")
    public String updateCourse(@PathVariable Long id, @RequestBody CourseModels updatedCourse) {
        updatedCourse.setId(id);
        return service.updateCourse(updatedCourse);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {
        return service.deleteCourse(id);
    }
}
