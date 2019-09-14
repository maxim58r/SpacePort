package ru.max;

public class RemoteControl {
    private RocketLaunchingShaft rocketLaunchingShaft = new RocketLaunchingShaft();

    void launch() {
        rocketLaunchingShaft.shipDelivery();
        System.out.println("Mission control center allows launch to ship");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Final countdown: " + i);
        }
        System.out.println("Start");


    }

}
