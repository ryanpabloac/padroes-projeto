package ex02;

public class PedidoLoja extends Pedido {

    public PedidoLoja(double valor, int qtd) {
        super(valor, qtd);
    }
    @Override
    protected void processarPagamento(FormaPgto formaPgto){
        if(formaPgto == FormaPgto.CRIPTOMOEDA) throw new RuntimeException("Forma de Pagamento inválida");
        // Lógica de pagamento ...
        System.out.println("Forma de pagamento: " + formaPgto);
    }

    @Override
    protected boolean haEntrega() {
        return false;
    }
}
