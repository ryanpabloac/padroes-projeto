package ex02;

public abstract class Pedido {
    private double valor;
    private int qtd;

    public Pedido(double valor, int qtd) {
        this.valor = valor;
        this.qtd = qtd;
    }

    protected abstract void processarPagamento(FormaPgto formaPgto);

    protected abstract boolean haEntrega();

    public void finalizarPedido(FormaPgto formaPgto) {
        try {
            System.out.println("===== PEDIDO =====");
            System.out.println("Valor Total: R$" + (valor * qtd));
            processarPagamento(formaPgto);
            if (haEntrega()) System.out.println("Pedido para entrega");
        } catch (RuntimeException e) {
            System.out.println("Impossível finalizar pedido! Motivo: " + e.getMessage());
        }
    }
}
