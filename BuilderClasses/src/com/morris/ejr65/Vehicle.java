package com.morris.ejr65;

/**
 * In Fish.java I've implemented a simple Fish object using a Builder class and a static factory method. Using
 * a builder class is dynamic. Much like the Java bean it allows structured code when dealing with a hand-ful
 * of constructors although it can become unsafe and inconsistent. On the other hand the Builder class is also
 * like telescoping constructors of varying parameters which allows for safety and immutability. Implementing a
 * Builder class takes from the both of both words. In the Fish.java class I've implemented a Builder class that
 * knew exactly three default parameters, but what if there are many fields that require only a few default para-
 * meters and other unknowns. Let's practice implementing a car object which allows for some default parameters
 * and some other parameters that a customer may choose from his or her own liking.
 *
 * @author Wali Morris
 * @since 08/06/2020
 */

public class Vehicle {
    private final int wheels;
    private final int doors;
    private final int seats;
    private int cupHolders;
    private final String color;
    private final String trimColor;
    private final String rimColor;

    public static class Builder {
        // mandatory field
        private int wheels = 4;
        private int doors = 4;
        private int seats = 4;

        // optional parameter
        private int cupHolders = 0;

        // required parameters
        private final String color;
        private final String trimColor;
        private final String rimColor;

        public Builder(String color, String trimColor, String rimColor) {
            this.color = color;
            this.trimColor = trimColor;
            this.rimColor = rimColor;
        }

        public Builder cupHolders(int cupHolders) {
            this.cupHolders = cupHolders;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

    private Vehicle(Builder builder) {
        this.wheels = builder.wheels;
        this.doors = builder.doors;
        this.seats = builder.seats;
        this.cupHolders = builder.cupHolders;
        this.color = builder.color;
        this.trimColor = builder.trimColor;
        this.rimColor = builder.rimColor;
    }

    public String getColor() {
        return this.color;
    }

    public String getTrimColor() {
        return this.trimColor;
    }

    public String getRimColor() {
        return this.rimColor;
    }

    public int getCupHolders() {
        return cupHolders;
    }

    public int getWheels() {
        return this.wheels;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getSeats() {
        return this.seats;
    }

    @Override
    public String toString() {
        String vehicleStats = String.format("\nVehicle stats\n-------------\ncolor: %s\ntrim color: %s\n" +
                        "rim color: %s\nseats: %d\n", this.getColor(), this.getTrimColor(), this.getRimColor(),
                this.getSeats());
        return vehicleStats;
    }
}
