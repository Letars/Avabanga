package Lesson06;

import Lesson06.model.Animal;

public class Start {

    public static void main(String[] args) {

        System.out.println("Кошка: ");
        Animal cat = new Cat("Барсик",200,0);
        cat.run(138);
        cat.swim(1);
        System.out.println("*********************");


        System.out.println("Собака: ");
        Animal dog = new Dog("Шарик",500,10);
        dog.run(333);
        dog.swim(8);
    }
}
