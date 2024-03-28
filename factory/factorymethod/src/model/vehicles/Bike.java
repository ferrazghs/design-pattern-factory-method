package model.vehicles;

import interfaces.IVehicle;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega!");
    }

    @Override
    public void getCargo() {
        System.out.println("Alimento recolhido com sucesso!");
    }
}
