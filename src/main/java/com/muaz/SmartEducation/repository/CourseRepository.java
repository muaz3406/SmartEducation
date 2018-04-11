package com.muaz.SmartEducation.repository;


import com.muaz.SmartEducation.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseRepository extends JpaRepository<Course,Long> {
List<Course> findByName(String name);
}
