package ru.max;

class Pilot {
    String name;
    int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void aboutYourself() {
        System.out.println("Name of pilot: " + getName() + "\nAge of pilot: " + getAge() );
    }
}
