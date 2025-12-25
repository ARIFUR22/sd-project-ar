package com.iiuc.sd_project.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.iiuc.sd_project.model.CourseModels;

@Service
public class CourseServices {

    private List<CourseModels> courses = new ArrayList<>();
    private Long nextID=1L;

    // shob data eksathe return korbe
    public List<CourseModels> getAllCourses() {
        return courses;
    }

    // ID diye exact karo data return korbe
    public CourseModels getCoursesByID(Long id) {
        for (CourseModels datas : courses) {
            if (datas.getId().equals(id)) {
                return datas;
            }
        }
        return null;
    }

    // Notun course add korbe
    public String addCourse(CourseModels datas) {
        datas.setId(nextID);
        nextID++;
        
        courses.add(datas);
        return "Course Added Successfully!";
    }

    // Existing kono course er data change korbe
    public String updateCourse(CourseModels updateDatas) {
        CourseModels found = getCoursesByID(updateDatas.getId());
        if (found == null) 
        {
            return "Course doesn't found!!!";
        } 
        else 
        {
            if (updateDatas.getCode() != null) found.setCode(updateDatas.getCode());
            if (updateDatas.getTitle() != null) found.setTitle(updateDatas.getTitle());
            if (updateDatas.getCredit() != null) found.setCredit(updateDatas.getCredit());
            if (updateDatas.getType() != null) found.setType(updateDatas.getType());
            if (updateDatas.getSemester() != null) found.setSemester(updateDatas.getSemester());
            if (updateDatas.getDepartmentId() != null) found.setDepartmentId(updateDatas.getDepartmentId());
            if (updateDatas.getTeacher() != null) found.setTeacher(updateDatas.getTeacher());
            return "Course Updated Successfully!";
        }
    }

    // Course delete korbe
    public String deleteCourse(Long id) {
        CourseModels found = getCoursesByID(id);
        if (found == null) 
        {
            return "Course doesn't found!!!";
        } 
        else
        {
            courses.remove(found);
            return "Course doesn't found!!!";
        }
    }
}

