public enum Puesto {
    //es una lista cerrada de constantes
    AGENTE_SERVICIOS("001"),EMPLEADO_OFICINA("002"),DIRECTIVO("003");


   //metodo constructor
    Puesto(String codigo) {
        this.codigo = codigo;
    }

    String codigo;

    //metodos getter y setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "-> Codigo:" + codigo;


    }
}
