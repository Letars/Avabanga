package Lesson06;

import Lesson06.model.Animal;

public class Cat extends Animal {

    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void swim(int swim) {
        System.out.println(name + " плавать не умеет, печалька :(");;
    }
}
