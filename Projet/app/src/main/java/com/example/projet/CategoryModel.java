package com.example.projet;

public class CategoryModel {
    private String carname;
    private String brand;
    private String color;
    private static String type;
    private String transmission;
    private Engine engine;
    private String fuel;
    private int seats;

    // Empty constructor required for Firebase
    public CategoryModel() {
    }

    // Getter and setter methods

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    // Engine class
    public static class Engine {
        private double liters;
        private int cylinders;

        // Empty constructor required for Firebase
        public Engine() {
        }

        // Getter and setter methods

        public double getLiters() {
            return liters;
        }

        public void setLiters(double liters) {
            this.liters = liters;
        }

        public int getCylinders() {
            return cylinders;
        }

        public void setCylinders(int cylinders) {
            this.cylinders = cylinders;
        }
    }
}
