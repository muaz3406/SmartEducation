package com.muaz.SmartEducation.resource;


import com.muaz.SmartEducation.entities.ToDoList;
import com.muaz.SmartEducation.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/smarteducation/todolistresource")
public class ToDoListResource {

    @Autowired
    private ToDoListRepository toDoListRepository;

   @GetMapping("/all")
        public List<ToDoList> getAll(){return toDoListRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<ToDoList> getHomework(@PathVariable("name") final String name) {
        return toDoListRepository.findByName(name);
    }

    @GetMapping("/id/{id}")
    public ToDoList getId(@PathVariable("id") final Long id) {
        return toDoListRepository.findOne(id);
    }


    @GetMapping("/update/{id}/{name}")
    public ToDoList update(@PathVariable("id") final Long id,@PathVariable final String name){
            ToDoList toDoList=getId(id);
            toDoList.setName(name);
            return toDoListRepository.save(toDoList);
    }




}
