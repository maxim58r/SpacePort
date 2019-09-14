package ru.max;

public class SpaceShipPort {
    private RemoteControl remoteControl = new RemoteControl();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpaceShipPort(String name) {
        this.name = name;
    }

    void launchToShip(String name) {
        remoteControl.launch();
        System.out.printf("Ship launch from space ship port: %s\n", name.toUpperCase());
    }

}
