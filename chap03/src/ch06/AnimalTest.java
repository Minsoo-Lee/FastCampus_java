package ch06;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("Animal move");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("Human move");
    }

    public void readBook() {
        System.out.println("Human read books");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("Tiger move");
    }

    public void hunting() {
        System.out.println("Tiger Hunt");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("Eagle move");
    }

    public void flying() {
        System.out.println("Eagle fly");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
        // 하위 클래스 여러 개를 상위 클래스 하나로 컨트롤 가능

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList) {
            animal.move();
        }
    }

    public void moveAnimal (Animal animal) {
        animal.move();
    }
}
