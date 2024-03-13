package ru.gb.springbootseminar;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/search")
    public List<Student> getStudentsBySubstring(@RequestParam String name) {
        return studentService.getStudentsBySubstring(name);
    }

    @GetMapping("/group/{groupName}/student")
    public List<Student> getStudentByGroupName(@PathVariable("groupName") int groupName) {
        return studentService.getStudentsByGroupName(groupName);
    }
}
