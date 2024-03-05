package ru.geekbrains.MyFirstProject;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Engine {
    public Engine() {
        System.out.println("Engine started.");
    }
    public void go(){
        System.out.println("Let's go!!!");
    }
}
