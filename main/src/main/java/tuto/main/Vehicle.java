package tuto.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vehicle{
    private int maxSpeed;

    List<String> seats;

    @Override
    public String toString() {
        return String.format("""
                speed : %d
                seats : %s
                """, maxSpeed, seats);
    }

    public Vehicle(){
        super();
        seats = new ArrayList<>();
        seats.add("A");
        seats.add("B");
        maxSpeed=20;
    }

    public void setMaxSpeed(int maxSpeed) throws MyNegativeSpeedException{
        if (maxSpeed>=0){
            this.maxSpeed = maxSpeed;
        }
        else {
            throw new MyNegativeSpeedException("negative speed is impossible");
        }
    }

    // get the max speed
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public List<String> getSeats() {
        return List.copyOf(seats);
    }

    public void addSeats (String ... seats){
        this.seats.addAll(Arrays.asList(seats));
    }
}
