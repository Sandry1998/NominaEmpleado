/**
 * Clase Personal
 *
 * Atributos
 * nombre,apellido: texto
 * id: entero
 * nHijos: entero
 * puesto: Puesto(enum)
 * idIncremento: entero
 *
 */

public class Personal {

private String nombre;
private String apellido;
static int idGeneral=0; //solo se puede llamar en la clase y no se puede crear instancia en un objeto
private byte nHijos;
public Puesto PuestoE;
private int idEmpleado=0; //se instancia con cada objeto de la clase

    public Personal(String nombre, String apellido, byte nHijos, Puesto puestoE) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nHijos = nHijos;
        this.PuestoE = puestoE;
        this.idEmpleado = ++idGeneral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getnHijos() {
        return nHijos;
    }

    public void setnHijos(byte nHijos) {
        this.nHijos = nHijos;
    }

    public Puesto getPuestoE() {
        return PuestoE;
    }

    public void setPuestoE(Puesto puestoE) {
        PuestoE = puestoE;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        return "Personal-> " +
                " Nombre: " + nombre +
                " Apellido: " + apellido +
                " Nº Hijos: " + nHijos +
                " PuestoE: " + PuestoE +
                " IdEmpleado: " + idEmpleado +
                "\n.....................................\n";

    }
}
