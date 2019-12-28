package com.mycompany.app;

import com.mycompany.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final String SPACE = " ";

    public static void main(String[] args) {
        System.out.println(getMessage());
    }

    public static String getMessage() {
        Vehicle smallVehicle;
        smallVehicle = new Vehicle();

        smallVehicle.setType("Motorcycle");
        smallVehicle.setBrand("Toyota");
        smallVehicle.setWheelAmount(3);

        return smallVehicle.getType() + SPACE + smallVehicle.getBrand() + SPACE + smallVehicle.getWheelAmount();
    }

}
