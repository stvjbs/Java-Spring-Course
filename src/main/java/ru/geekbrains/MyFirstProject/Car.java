package ru.geekbrains.MyFirstProject;

import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.go();
    }
}
