package com.muaz.SmartEducation.resource;


import com.muaz.SmartEducation.entities.Course;
import com.muaz.SmartEducation.entities.User;
import com.muaz.SmartEducation.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/smarteducation/courseresource")
public class CourseResource {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/all")
        public List<Course> getAll(){return courseRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<Course> getCourse(@PathVariable("name") final String name) {
        return courseRepository.findByName(name);
    }

    @GetMapping("/id/{id}")
    public Course getId(@PathVariable("id") final Long id) {
        return courseRepository.findOne(id);
    }

    @GetMapping("/update/{id}/{name}")
    public Course update(@PathVariable("id") final Long id,@PathVariable final String name){

            Course course=getId(id);
            course.setName(name);
            return courseRepository.save(course);
    }

}
