import java.util.ArrayList;

public class Cadastro {
    private String login;
    private String senha;
    private ArrayList<Dispositivo> dispositivos;

    public Cadastro(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.dispositivos = new ArrayList<>();
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void adicionarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }
}
