package ex04;

import ex04.bancoDados.BancoDados;
import ex04.bancoDados.BancoDadosProxy;
import ex04.usuario.Permissao;
import ex04.usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ryan", Permissao.ADMIN);
        BancoDados banco1 = new BancoDadosProxy(usuario1);

        System.out.println(banco1.consultar("CREATE TABLE usuarios;"));

        Usuario usuario2 = new Usuario("XYZ", Permissao.VISITANTE);
        BancoDados banco2 = new BancoDadosProxy(usuario2);

        System.out.println(banco2.consultar("CREATE TABLE usuarios;"));

    }
}
