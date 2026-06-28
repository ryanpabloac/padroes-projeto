package ex03;

public class Exercicio3 {
    static void main() {
        CET cet = new CET();
        Assinante pref = new PrefeituraUberlandia();
        Assinante aero = new AeroportoUberlandia();

        cet.adicionarAssinante(pref);
        cet.adicionarAssinante(aero);

        for(int i=0; i<3; i++) cet.medir();
    }
}
