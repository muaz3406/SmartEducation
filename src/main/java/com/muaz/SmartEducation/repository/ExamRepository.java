package com.muaz.SmartEducation.repository;


import com.muaz.SmartEducation.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamRepository extends JpaRepository<Exam,Long> {
    List<Exam> findByName(String name);

}
