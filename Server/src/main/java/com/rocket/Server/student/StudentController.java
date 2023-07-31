package com.rocket.server.student;

import com.rocket.server.marks.Marks;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SchoolManageSystem/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;


    @GetMapping("getStudentMarks/{subjectName}")
    public Marks getStudentMarksInSubject(@PathVariable String subjectName, @RequestHeader("Authorization") String authorizationHeader){
        return studentService.getStudentMarksInSubject(subjectName, authorizationHeader);
    }
}