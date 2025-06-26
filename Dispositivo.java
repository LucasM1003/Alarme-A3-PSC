public abstract class Dispositivo {
    private int id;
    private String local;
    private String equipamentos;
    private String modelo;

    public Dispositivo(int id, String local, String equipamentos, String modelo) {
        this.id = id;
        this.local = local;
        this.equipamentos = equipamentos;
        this.modelo = modelo;
    }

    public int getId() { return id; }
    public String getLocal() { return local; }
    public String getEquipamentos() { return equipamentos; }
    public String getModelo() { return modelo; }

    public void setId(int id) { this.id = id; }
    public void setLocal(String local) { this.local = local; }
    public void setEquipamentos(String equipamentos) { this.equipamentos = equipamentos; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public abstract String modelo();
}