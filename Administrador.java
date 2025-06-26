public class Administrador extends Usuario {
    private String setorResponsavel;

    public Administrador(String nome, int nivelAcesso, String setorResponsavel) {
        super(nome, nivelAcesso);
        this.setorResponsavel = setorResponsavel;
    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public void emitirRelatorio() {
        System.out.println("Relatório emitido pelo administrador do setor: " + setorResponsavel);
    }
}
