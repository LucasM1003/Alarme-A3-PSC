public class Notificacao {
    private String mensagem;
    private String tipo;

    public Notificacao(String mensagem, String tipo) {
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
