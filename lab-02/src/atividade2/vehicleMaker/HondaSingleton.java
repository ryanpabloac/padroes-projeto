package atividade2.vehicleMaker;

import atividade2.LicensePlateFactory;
import atividade2.vehicle.Civic;
import atividade2.vehicle.Vehicle;

public class HondaSingleton implements VehicleMaker {
    private static HondaSingleton instance;

    private HondaSingleton() {}

    public static VehicleMaker getInstance() {
        if(instance == null) instance = new HondaSingleton();

        return instance;
    }

    @Override
    public Vehicle makeVehicle(String model) {
        Vehicle v;
        String lp = LicensePlateFactory.generate();
        
        if(model.equals("Civic")) v = new Civic(lp);
        
        return v;
    }
}
