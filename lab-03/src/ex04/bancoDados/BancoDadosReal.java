package ex04.bancoDados;

public class BancoDadosReal implements BancoDados {
    @Override
    public String consultar(String query) {
        return "Query: " + query;
    }
}