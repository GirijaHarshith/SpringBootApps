package com.example.crud.Models;

/*import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;*/
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity(name="teachers")
public class Teachers implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//            auto increment the id
    Long teacherId;
    String teacherName;
    String subject;
    Long age;


//    @OneToMany(mappedBy = "studentId",fetch = FetchType.LAZY)
//    private List<Students> studentsSet;


}
