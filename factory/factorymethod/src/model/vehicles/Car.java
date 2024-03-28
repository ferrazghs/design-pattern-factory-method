package model.vehicles;

import interfaces.IVehicle;

public class Car implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto!");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegando os passageiros, estamos prontos!");
    }
}
