package com.morris.ejr65;

public class Main {
    public static void main(String[] args) {
	    Fish goldfish = new Fish.Builder(2,2, "Gold").build();
	    System.out.println(goldfish.getColor());
        System.out.println(goldfish.getEyeCount());
        System.out.println(goldfish.getFinCount());
        Vehicle audi = new Vehicle.Builder("white", "black", "black").cupHolders(2).build();
        System.out.println("Number of cup holders: " + audi.getCupHolders());
        String vehicleStats = audi.toString();
        System.out.println(vehicleStats); 

    }
}
