public class LogEvento {
    private String dataHora;
    private String evento;

    public LogEvento(String dataHora, String evento) {
        this.dataHora = dataHora;
        this.evento = evento;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getEvento() {
        return evento;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
