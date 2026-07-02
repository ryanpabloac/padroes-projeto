package ex02;

public class PedidoOnline extends Pedido {
    public PedidoOnline(double valor, int qtd) {
        super(valor, qtd);
    }

    @Override
    protected void processarPagamento(FormaPgto formaPgto){
        if(formaPgto == FormaPgto.DINHEIRO) throw new RuntimeException("Forma de Pagamento inválida");
        // Lógica de pagamento ...
        System.out.println("Forma de pagamento: " + formaPgto);
    }

    @Override
    protected boolean haEntrega() {
        return true;
    }
}
