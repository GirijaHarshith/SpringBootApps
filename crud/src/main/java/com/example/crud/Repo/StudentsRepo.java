package com.example.crud.Repo;

import com.example.crud.Models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Long> {
    /*@Query(value = "SELECT * FROM students WHERE student_name = 'aditya' ", nativeQuery = true)
    List<Students> query1();

    @Query(value = "SELECT * FROM students WHERE student_name LIKE %:pattern% ", nativeQuery = true)
    List<Students> query(@Param(value = "pattern") String s);*/
}
