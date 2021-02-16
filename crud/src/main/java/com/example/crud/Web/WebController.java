package com.example.crud.Web;

import com.example.crud.Models.Students;
import com.example.crud.Repo.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WebController {
    @Autowired
    private StudentsRepo studentsRepo;

    @GetMapping("/add")
    public String addForm(){
        return "addForm";
    }

    @PostMapping("/add")
    public String save(HttpServletRequest request, Students student, Model model, BindingResult result){
        if(result.hasErrors())
            return "addForm";
        student.setStudentName(request.getParameter("name"));
        student.setAge(Long.parseLong(request.getParameter("age")));
        student.setStandard(Integer.parseInt(request.getParameter("standard")));
        student.setSubject(request.getParameter("subject"));
        studentsRepo.save(student);

        List<Students> list = studentsRepo.findAll();
        model.addAttribute("listOfStudents", list);
        return "index";
    }
}
