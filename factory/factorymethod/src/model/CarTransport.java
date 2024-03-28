package model;

import interfaces.IVehicle;
import model.vehicles.Car;

public class CarTransport extends Transport {
    //Classe concreta
    @Override
    protected IVehicle createTransport() {

        return new Car();
    }
}
