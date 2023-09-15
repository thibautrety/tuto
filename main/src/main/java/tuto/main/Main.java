package tuto.main;

import java.util.List;

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        try {
            vehicle.setMaxSpeed(5);
        } catch (MyNegativeSpeedException exception) {
            System.out.println(exception.getMessage());
        }
        List<String> seats = vehicle.getSeats();

        vehicle.addSeats("C","D");
        System.out.println(vehicle);
    }

}
