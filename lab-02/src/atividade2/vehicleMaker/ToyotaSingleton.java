package atividade2.vehicleMaker;

import atividade2.vehicle.Vehicle;

public class ToyotaSingleton implements VehicleMaker {
    private static ToyotaSingleton instance;

    private ToyotaSingleton() {}

    public static VehicleMaker getInstance() {
        if(instance == null) instance = new ToyotaSingleton();

        return instance;
    }

    @Override
    public Vehicle makeVehicle(String model) {
        Vehicle v;
        String lp = LicensePlateFactory.generate();
        
        if(model.equals("Corolla")) v = new Corolla(lp);
        
        return v;
    }
}
