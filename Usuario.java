public class Usuario {
    private String nome;
    private int nivelAcesso;

    public Usuario(String nome, int nivelAcesso) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
