package atividade2.vehicle;

public class Corolla implements Vehicle {
    private String licensePlate;

    public Corolla(String licensePlate) {
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
