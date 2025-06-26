import java.util.ArrayList;

public class Historico {
    private ArrayList<LogEvento> eventos;
    private Usuario usuario;

    public Historico(Usuario usuario) {
        this.usuario = usuario;
        this.eventos = new ArrayList<>();
    }

    public ArrayList<LogEvento> getEventos() {
        return eventos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setEventos(ArrayList<LogEvento> eventos) {
        this.eventos = eventos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void adicionarEvento(LogEvento evento) {
        eventos.add(evento);
    }
}
