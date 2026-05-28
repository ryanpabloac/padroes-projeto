package atividade2.vehicle;

public class Civic implements Vehicle {
    private String licensePlate;

    public Civic(String licensePlate) {
      this.licensePlate = licensePlate;
    }
    
    @Override
    public void start() {
      System.out.println("Ligando...");
    }

    @Override
    public void drive() {
      System.out.println("Dirigindo...");
    }

    @Override
    public void stop() {
      System.out.println("Parando...");
    }
}
