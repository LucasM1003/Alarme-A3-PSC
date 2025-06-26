import java.util.ArrayList;

public class PlanoSeguranca {
    private String nome;
    private String descricao;
    private ArrayList<Dispositivo> dispositivos;

    public PlanoSeguranca(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dispositivos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }
}
