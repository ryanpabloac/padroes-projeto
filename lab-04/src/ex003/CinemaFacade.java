package ex003;

import ex003.dispositivos.*;

public class CinemaFacade {
    private Amplificador amplificador;
    private Luz luz;
    private MaquinaPipoca maquinaPipoca;
    private PlayerStreaming playerStreaming;
    private Projetor projetor;
    private Telao telao;

    public CinemaFacade(Amplificador amplificador, Luz luz, MaquinaPipoca maquinaPipoca, PlayerStreaming playerStreaming,
                        Projetor projetor, Telao telao) {
        this.amplificador = amplificador;
        this.luz = luz;
        this.maquinaPipoca = maquinaPipoca;
        this.playerStreaming = playerStreaming;
        this.projetor = projetor;
        this.telao = telao;
    }

    public void assistirFilme(String filme) {
        maquinaPipoca.ligar();
        maquinaPipoca.arrebentarPipoca();
        luz.desligar();
        telao.descer();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(10);
        playerStreaming.ligar();
        playerStreaming.play(filme);
    }

    public void fimFilme() {
        playerStreaming.desligar();
        amplificador.desligar();
        projetor.desligar();
        telao.subir();
        luz.ligar();
        maquinaPipoca.desligar();
    }
}