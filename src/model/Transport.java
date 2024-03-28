package model;

import interfaces.IVehicle;

public abstract class Transport {

    //Classe orientada a interface, nenhuma instancia de objeto (Car,Motorcycle)
    public void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();

}
