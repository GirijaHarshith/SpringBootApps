package com.example.crud.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "students")
@Getter
@Setter
public class Students implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long studentId;
     String studentName;
     Long age;
     Integer standard;
     String subject;

//    @ManyToOne
//    @JoinColumn(name = "teacherId",nullable = false)
//    @JsonIgnore
//    private Teachers teachers;


}
// actuators metrics that provide the info about app
// health
// loggers

//fetch types
// Eager: all the data
// lazy: only the data needed

//aditya, 1, english, 12, 23
//eager =  aditya, 1, english, 12, 23
//lazy= aditya


// Relationship mapping
// one to one
// one to many
// many to one
// many to many

// REST/RESTful vs SOAP


// custom queries
// Native
// select * from students;

