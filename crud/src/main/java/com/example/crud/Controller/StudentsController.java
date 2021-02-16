package com.example.crud.Controller;

import com.example.crud.Repo.StudentsRepo;
import com.example.crud.Models.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsRepo studentsRepo;

    @GetMapping
    public List<Students> getStudents(){
        return studentsRepo.findAll();
    }

//    @GetMapping
//    @RequestMapping("{id}")
//    public Students getStudents(@PathVariable Long id){
//        return studentsRepo.getOne(id);
//    }

    @PostMapping
    public Students postStudents(@RequestBody Students students){
        return studentsRepo.save(students);
    }

    @PutMapping("/put/{id}")
    Students updateStudent(@PathVariable (value = "id") Long id, @RequestBody Students student){
        Students oldStudent = studentsRepo.findById(id).orElseThrow(()->
                new ResourceNotFound("Not found","students",id));
        //oldStudent.setStudentId(student.getStudentId());
        oldStudent.setStudentName(student.getStudentName());
        oldStudent.setStandard(student.getStandard());
        oldStudent.setAge(student.getAge());
        return studentsRepo.save(oldStudent);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable (value = "id")Long id){
        Students student = studentsRepo.findById(id).orElseThrow(()->
                new ResourceNotFound("Student not found","students",id));
        studentsRepo.delete(student);
        return ResponseEntity.ok().build();
    }



//
//    @GetMapping//("/get/{id}")
//    public Students getStudentById(@PathVariable (value = "id")Long id){
//        return studentsRepo.findById(id).orElseThrow(()->
//                new ResourceNotFound("Student not found)","students",id));
//    }

    /*@GetMapping("/Q1")
    List<Students> query1(){
        return studentsRepo.query1();
    }

    @GetMapping("/Q2/{pattern}")
    List<Students> query2(@PathVariable(value = "pattern") String s){
        return studentsRepo.query(s);
    }*/

}
