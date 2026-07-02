package ex02;

/* b) O metodo template permite criar classes genéricas onde alguma parte do seu comportamento difere da classe
    base em um ou mais pontos através de herança. Diferentemente do padrão decorator que adiciona funcionalidades extras
    a uma classe base através de composição.
 */
public class Compra {
    public static void main(String[] args) {
        Pedido pedidoLoja = new PedidoLoja(3.56, 2);
        Pedido pedidoOnline = new PedidoOnline(12.54, 5);
        Pedido pedidoCripto = new PedidoCripto(34.25, 1);

        pedidoCripto.finalizarPedido(FormaPgto.CRIPTOMOEDA);
        System.out.println();
        pedidoLoja.finalizarPedido(FormaPgto.PIX);
        System.out.println();
        pedidoOnline.finalizarPedido(FormaPgto.DINHEIRO);
    }
}