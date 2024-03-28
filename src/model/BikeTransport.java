package model;

import interfaces.IVehicle;
import model.vehicles.Bike;

public class BikeTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
