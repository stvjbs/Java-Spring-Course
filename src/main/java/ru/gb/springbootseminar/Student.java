package ru.gb.springbootseminar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private int id;
    private String name;
    private int groupNumber;

    public Student(String name, int groupNumber, int id) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.id = id;
    }
}
