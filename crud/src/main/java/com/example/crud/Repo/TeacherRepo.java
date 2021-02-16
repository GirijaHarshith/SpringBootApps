package com.example.crud.Repo;

import com.example.crud.Models.Teachers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teachers,Long> {
}
