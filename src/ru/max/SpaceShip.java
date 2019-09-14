package ru.max;

public class SpaceShip {
    DetachableStep detachableSteps = new DetachableStep();
    String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    void startPreparation() {
        System.out.printf("Ship with name %s prepared of start\n", name);
    }

    void launch(String name, int age) {
        System.out.println("Ship by start with pilot: " + name + " and age: " + age);
        detachableSteps.separationStep();
    }
}
