package com.example.crud.Controller;

import com.example.crud.Models.Teachers;
import com.example.crud.Repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/teachers")
public class TeachersController {

    @Autowired
    TeacherRepo teacherRepo;

    @GetMapping
    public List<Teachers> getTeachers(){
        return teacherRepo.findAll();
    }

    @PostMapping
    public Teachers postTeacher(@RequestBody Teachers teachers){
        return teacherRepo.save(teachers);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTeacher(@PathVariable Long id){
        teacherRepo.deleteById(id);

    }

}
