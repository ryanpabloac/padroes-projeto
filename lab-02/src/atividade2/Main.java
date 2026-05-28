package atividade2;

import atividade2.vehicle.Vehicle;
import atividade2.vehicleMaker.HondaSingleton;
import atividade2.vehicleMaker.VehicleMaker;

public class Main {
    public static void main(String[] args) {
        VehicleMaker honda = HondaSingleton.getInstance();
        Vehicle civic = honda.makeVehicle("Civic");

    }
}
