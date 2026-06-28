package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CET {
    private List<Assinante> assinantes;
    private double vento;
    private double umidadeAr;
    private double temperatura;

    public CET() {
        this.assinantes = new ArrayList<>();
    }
    public void adicionarAssinante(Assinante assinante) {
        this.assinantes.add(assinante);
    }

    public void medir() {
        this.umidadeAr = ThreadLocalRandom.current().nextDouble(0,1);
        this.vento = ThreadLocalRandom.current().nextDouble(0,200);
        this.temperatura = ThreadLocalRandom.current().nextDouble(-40,100);

        notificarAssinantes();
    }
    private void notificarAssinantes() {
        for(Assinante a : assinantes) a.atualizar(umidadeAr, vento, temperatura);
    }
}
