package com.muaz.SmartEducation.repository;


import com.muaz.SmartEducation.entities.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoListRepository extends JpaRepository<ToDoList,Long>{
    List<ToDoList> findByName(String name);
}
