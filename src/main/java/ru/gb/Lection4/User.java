package ru.gb.Lection4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}