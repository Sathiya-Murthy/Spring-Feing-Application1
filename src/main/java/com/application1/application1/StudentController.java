package com.application1.application1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app1")
@RestController
public class StudentController {
    @Autowired
    RestClientService restClientService;
    @GetMapping("/student/send")
    public Student save(){
        Student student = new Student();
        student.setFirstName("Sathiya");
        student.setLastName("Murthy");
        student.setGraduation("B.Tech");
        return restClientService.save(student);
    }
}
