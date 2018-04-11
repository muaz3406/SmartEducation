package com.muaz.SmartEducation.resource;


import com.muaz.SmartEducation.entities.Course;
import com.muaz.SmartEducation.entities.Exam;
import com.muaz.SmartEducation.entities.ToDoList;
import com.muaz.SmartEducation.entities.User;
import com.muaz.SmartEducation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
@RequestMapping("/smarteducation/userrepository")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<User> getUser(@PathVariable("name") final String name) {
        return userRepository.findByName(name);
    }

    @GetMapping("/id/{id}")
    public User getId(@PathVariable("id") final Long id) {
        return userRepository.findOne(id);
    }


    @GetMapping("/update/surname/{id}/{surname}")
    public User updateSurname(@PathVariable("id") final Long id, @PathVariable final String surname) {
        User user = getId(id);
        user.setSurname(surname);

        return userRepository.save(user);
    }

    @GetMapping("/update/email/{id}/{email}")
    public User updateEmail(@PathVariable("id") final Long id, @PathVariable final String email) {
        User user = getId(id);
        user.setEmail(email);

        return userRepository.save(user);
    }

    @GetMapping("/update/sex/{id}/{sex}")
    public User updateSex(@PathVariable("id") final Long id, @PathVariable final String sex) {
        User user = getId(id);
        user.setSex(sex);

        return userRepository.save(user);
    }

    @GetMapping("/update/password/{id}/{password}")
    public User updatePassword(@PathVariable("id") final Long id, @PathVariable final String password) {
        User user = getId(id);
        user.setPassword(password);

        return userRepository.save(user);
    }


    @GetMapping("/add/course/{id}/{courseName}/{courseDay}/{courseTime}/{courseStartDate}/{courseEndDate}")
    public User addUserCourse(@PathVariable("id") final Long id,
                              @PathVariable("courseName") final String courseName,
                              @PathVariable("courseDay") final String courseDay,
                              @PathVariable("courseTime") final String courseTime,
                              @PathVariable("courseStartDate") final String courseStartDate,
                              @PathVariable("courseEndDate") final String courseEndDate) {
        User user = getId(id);
        Course course = new Course();
        course.setName(courseName);
        course.setCourse_day(courseDay);
        course.setCourse_time(courseTime);
        course.setCourse_start_date(courseStartDate);
        course.setCourse_end_date(courseEndDate);

        user.getCourses().add(course);

        return userRepository.save(user);
    }


    @GetMapping("/add/exam/{id}/{name}/{date}/{time}")
    public User addUserExam(@PathVariable("id") final Long id,
                            @PathVariable("name") final String name,
                            @PathVariable("date") final String date,
                            @PathVariable("time") final String time){
        User user=getId(id);
        Exam exam=new Exam();
        exam.setName(name);
        exam.setDate(date);
        exam.setTime(time);
        user.getExams().add(exam);

        return userRepository.save(user);
}

    @GetMapping("/add/todolist/{id}/{name}/{description}/{date}/{time}")
    public User addUserTask(@PathVariable("id") final Long id,
    @PathVariable("name")final String name,
    @PathVariable("description") final String description,
    @PathVariable("date")final String date,
    @PathVariable("time")final String time){

        User user=getId(id);
        ToDoList toDoList=new ToDoList();
        toDoList.setName(name);
        toDoList.setDescription(description);
        toDoList.setTask_date(date);
        toDoList.setTime(time);

        user.getToDoLists().add(toDoList);
        return userRepository.save(user);
}
}