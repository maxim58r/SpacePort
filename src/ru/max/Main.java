package ru.max;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        pilot.setName("Strelka");
        pilot.setAge(10);
        pilot.aboutYourself();

        SpaceShip spaceShip = new SpaceShip("Souz");
        spaceShip.startPreparation();

        SpaceShipPort spaceShipPort = new SpaceShipPort("Baikonur");
        spaceShipPort.launchToShip(spaceShipPort.getName());
        spaceShip.launch(pilot.getName(), pilot.getAge());
    }
}
