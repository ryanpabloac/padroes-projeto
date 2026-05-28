package atividade2;

import atividade2.vehicle.Vehicle;

import java.util.Random;

public class LicensePlateFactory {

    public static String generate() {
        Random r = new Random();
        String licensePlate = "";
        for (int i=0; i<5; i++) licensePlate += r.nextInt(10);
        
        return licensePlate;
    }
}
