package com.muaz.SmartEducation.resource;


import com.muaz.SmartEducation.entities.Exam;
import com.muaz.SmartEducation.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/smarteducation/examresource")
public class ExamResource {

    @Autowired
    private ExamRepository examRepository;

     @GetMapping("/all")
        public List<Exam> getAll(){return examRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<Exam> getExam(@PathVariable("name") final String name) {
        return examRepository.findByName(name);
    }

    @GetMapping("/id/{id}")
    public Exam getId(@PathVariable("id") final Long id) {
        return examRepository.findOne(id);
    }


    @GetMapping("/update/{id}/{name}")
    public Exam update(@PathVariable("id") final Long id,@PathVariable final String name){
            Exam exam=getId(id);
            exam.setName(name);
            return examRepository.save(exam);
    }
}
