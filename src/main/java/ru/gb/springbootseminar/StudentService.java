package ru.gb.springbootseminar;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private int currentId = 0;
    private final List<Student> studentsList = new ArrayList<>(Arrays.asList(
            new Student("Alexander", 1, ++currentId),
            new Student("Alexa", 1, ++currentId),
            new Student("Steve", 2, ++currentId),
            new Student("Jessica", 2, ++currentId),
            new Student("Johnathan", 3, ++currentId),
            new Student("Elizabeth", 3, ++currentId),
            new Student("John", 4, ++currentId),
            new Student("Eliza", 4, ++currentId),
            new Student("Alexey", 5, ++currentId),
            new Student("Becky", 5, ++currentId)));

    public Student getStudentById(int id) {
        return studentsList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public List<Student> getAllStudents() {
        return List.copyOf(studentsList);
    }

    public List<Student> getStudentsBySubstring(String substring) {
        return List.copyOf(studentsList.stream().filter(x -> x.getName().toLowerCase()
                .contains(substring.toLowerCase())).toList());
    }

    public List<Student> getStudentsByGroupName(int groupNumber) {
        return studentsList.stream().filter(x -> x.getGroupNumber() == groupNumber).toList();
    }

}
