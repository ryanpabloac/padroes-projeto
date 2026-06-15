package ex04.usuario;

public class Usuario {
    String nome;
    private Permissao permissao;

    public Usuario(String nome, Permissao permissao) {
        this.nome = nome;
        this.permissao = permissao;
    }

    public String getNome() {
        return nome;
    }

    public Permissao getPermissao() {
        return permissao;
    }
}
