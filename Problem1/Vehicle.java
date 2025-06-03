package Problem1;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;
    Vehicle(String make,String model,int year,String fuelType,double fuelEfficiency){
        this.make = make;
        this.model = model;
        this.year=year;
        this.fuelType=fuelType;
        this.fuelEfficiency=fuelEfficiency;
    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    public String getFuelType() {
        return fuelType;
    }
     public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }
    public String getMake() {
        return make;
    }
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
    public abstract double getMaxSpeed();
}
