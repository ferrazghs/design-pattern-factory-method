package model;

import interfaces.IVehicle;
import model.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    //Classe concreta
    @Override
    protected IVehicle createTransport() {

        return new Motorcycle();
    }
}
