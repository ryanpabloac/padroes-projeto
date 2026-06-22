package ex004;

class CarroFacade {

    private Motor motor;
    private Porta porta;
    private CintoSeguranca cinto;
    private Farol farol;
    private Radio radio;

    public CarroFacade() {
        motor = new Motor();
        porta = new Porta();
        cinto = new CintoSeguranca();
        farol = new Farol();
        radio = new Radio();
    }

    public void iniciarCorrida() {
        System.out.println("\nIniciando corrida");

        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar("90.1");
    }

    public void finalizarCorrida() {
        System.out.println("\nFinalizando corrida");

        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}