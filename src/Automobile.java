public class Automobile {
    private String make;
    private String model;
    private double mileage;
    private double fuelTank;
    private double fuel;
    public Automobile(String mk, String mdl, double mi, double fT){
        make = mk;
        model = mdl;
        mileage = mi;
        fuelTank = fT;
        fuel += fuelTank;
    }

    public double fillUp(double gallons){
        fuel += gallons;
        if(fuel > fuelTank){
            fuel += fuelTank;
        }
        return fuel;
    }


    public double takeTrip(double miles){
        fuel -= (miles/mileage);
        if(fuel <= 0){
            fuel = 0;
        }
        return fuel;
    }

    public double reportFuel(){
        return fuel;
    }


}
