import java.util.*;

public class Main {
    public static void main(String[] args) {
        Personal emp1=new Personal("Sandra","Lopez",(byte) 4,Puesto.AGENTE_SERVICIOS);
        System.out.println(emp1);
        Personal emp2=new Personal("Candy","Queen",(byte) 2,Puesto.EMPLEADO_OFICINA);
        System.out.println(emp2);
        Personal emp3= new Personal("Noelia","Martinez",(byte) 3,Puesto.DIRECTIVO);
        System.out.println(emp3);
        Personal emp4=new Personal("Maria","De La Hoz",(byte) 2,Puesto.DIRECTIVO);
        System.out.println(emp4);
        Personal emp5=new Personal("Ana","Garcia",(byte) 1,Puesto.EMPLEADO_OFICINA);
        System.out.println(emp5);


        Nomina n1=new Nomina(190,9.76,emp1);
        Nomina n2=new Nomina(190,3.76,emp2);
        Nomina n3=new Nomina(190,4.70,emp3);
        Nomina n4=new Nomina(190,2.18,emp4);
        Nomina n5=new Nomina(190,1.34,emp5);
        Nomina n6=new Nomina();//esta creada pero sus atributos son null
        List<Nomina> nominas=new ArrayList<>();
        nominas.add(n1);
        nominas.add(n2);
        nominas.add(n3);
        nominas.add(n4);
        nominas.add(n5);
        nominas.add(n6);

        for (Nomina nomina : nominas) {
            nomina.mostrarNomina();
        }

        //se puede utilizar tanto en list como set
       Iterator<Nomina> it=nominas.iterator();
          Nomina n;
          while (it.hasNext()) {
              n=it.next();
              if(n.getP().getApellido().equals("Queen")){
                  it.remove();
              }
          }
          System.out.println("\n*******Sin Queen*******");
          for (Nomina nomina : nominas) {
              nomina.mostrarNomina();
          }






    }







    }





