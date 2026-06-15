package ex04.bancoDados;

import ex04.usuario.Permissao;
import ex04.usuario.Usuario;

public class BancoDadosProxy implements BancoDados {
    private Usuario usuario;
    private BancoDados bancoDados;

    public BancoDadosProxy(Usuario usuario) {
        this.usuario = usuario;
        this.bancoDados = new BancoDadosReal();
    }

    @Override
    public String consultar(String query) {
        if (usuario.getPermissao() != Permissao.ADMIN) {
            throw new RuntimeException("Permissão Negada!");
        }
        return bancoDados.consultar(query);
    }
}