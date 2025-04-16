public class Nomina {
    private double nHoras;
    private double tarifaHoras;
    private Personal p;
    private double salarioBruto;
    private final double D_DEUDA_SOCIAL=3.46;
    private final double D_NO_COMUN=6.15;
    private final double D_SE_MED=0.95;
    private final double D_FONDO_P=4.44;
    private final double D_SEG_DES=3.05;
    private final double D_PENSION_C=3.81;
    private final double D_CONT_JUB_ANT=1.02;

    public Nomina(double nHoras, double tarifaHoras, Personal p) {
        this.nHoras = nHoras;
        this.tarifaHoras = tarifaHoras;
        this.p = p;
        calcularSalarioBruto();
    }

    public double getnHoras() {
        return nHoras;
    }

    public void setnHoras(double nHoras) {
        this.nHoras = nHoras;
    }

    public double getTarifaHoras() {
        return tarifaHoras;
    }

    public void setTarifaHoras(double tarifaHoras) {
        this.tarifaHoras = tarifaHoras;
    }
    public double calcularPrimaFamiliar(){
        double primaFamiliar=0;
        if(this.p.getnHijos()==1){
            primaFamiliar=20;
        }else if(this.p.getnHijos()==2){
            primaFamiliar=50;
        }else if(this.p.getnHijos()>2){
            primaFamiliar=70+(this.p.getnHijos()-2)*20;
        }
        return primaFamiliar;
    }
    public void calcularSalarioBruto(){
        double salarioBruto=0,horasNormales=169,horasExtras50,horasExtras60;
        if(this.nHoras<169){
            salarioBruto=this.nHoras*this.tarifaHoras;
        }else if(this.nHoras<=180){
            horasExtras50=this.nHoras-horasNormales;
            salarioBruto=horasNormales*this.tarifaHoras+horasExtras50*this.tarifaHoras*1.5;
        }else{
            horasExtras50=180-horasNormales;
            horasExtras60=this.nHoras-180;
            salarioBruto=horasNormales*this.tarifaHoras+horasExtras50*this.tarifaHoras*1.5+horasExtras60*tarifaHoras*1.6;
        }
        this.salarioBruto=salarioBruto;
    }
    public double calcularDeduccion(double porcentaje){
        return (porcentaje/100)*this.salarioBruto;
    }

    public void mostrarNomina(){
        double dedSocial,dedConComun,dedSegMed,dedFondoP,dedSegDes,dedPensionC,dedContJubAnt,salarioNeto,deduccionTotal;
        System.out.println(p.toString());
        System.out.printf("Salario Bruto----------> %.2f € %n",this.salarioBruto);
        System.out.println("Calculo de deducciones");
        dedSocial=this.calcularDeduccion(this.D_DEUDA_SOCIAL);
        System.out.println("Deduccion social--------> "+dedSocial);
        dedConComun=this.calcularDeduccion(this.D_NO_COMUN);
        System.out.println("Deduccion Contigencias no Común--------> "+dedConComun);
        dedSegMed=this.calcularDeduccion(this.D_SE_MED);
        System.out.println("Deduccion Seguro Medico----------> "+dedSegMed);
        dedFondoP=this.calcularDeduccion(this.D_FONDO_P);
        System.out.println("Deduccion Fondo De Pensiones----------> "+dedFondoP);
        dedSegDes=this.calcularDeduccion(this.D_SEG_DES);
        System.out.println("Deduccion Seguro de Desempleo----------> "+dedSegDes);
        dedPensionC=this.calcularDeduccion(this.D_PENSION_C);
        System.out.println("Deducción Pensión complementaria (Entidad Privada)----------> "+dedPensionC);
        dedContJubAnt=this.calcularDeduccion(this.D_CONT_JUB_ANT);
        System.out.println("Deducción Jubilación Anticipada---------> "+dedContJubAnt);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Salario Bruto: "+this.salarioBruto);
        deduccionTotal=dedSocial+dedConComun+dedSegMed+dedFondoP+dedSegDes+dedPensionC+dedContJubAnt;
        System.out.println("Total deducciones: "+deduccionTotal);
        salarioNeto=this.salarioBruto-deduccionTotal;
        System.out.println("Prima familiar-------> "+this.calcularPrimaFamiliar());
        System.out.println("Salario neto----------> "+salarioNeto+calcularPrimaFamiliar());
    }













}
