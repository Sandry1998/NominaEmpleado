public class Main {
    public static void main(String[] args) {
        Personal emp1=new Personal("Sandra","Lopez",(byte) 4,Puesto.EMPLEADO_OFICINA);
        System.out.println(emp1);
        Personal emp2=new Personal("Candy","Perona",(byte) 2,Puesto.AGENTE_SERVICIOS);
        System.out.println(emp2);

        Nomina n=new Nomina(190,9.76,emp1);
        n.mostrarNomina();


    }
}