package com.example.crud.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name="subjects")
public class Subjects {
    @Id
    Long subjectId;
    String subjectName;
}
