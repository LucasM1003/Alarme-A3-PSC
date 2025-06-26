public class Tipo extends Dispositivo {
    public Tipo(int id, String local, String equipamentos, String modelo) {
        super(id, local, equipamentos, modelo);
    }

    @Override
    public String modelo() {
        return getModelo();
    }
}