import java.util.*; 
public class Nomina {  
  public void nomina(Scanner teclado){ 
    Scanner teclado = new Scanner(System.in);
    double brutoNomina; 
    String estado;
    int h60 = 0;
    int h50 = 0;
    System.out.print("Introduce apellido: ");  
    String apellido = teclado.nextLine();
    System.out.print("Introduce nombre: ");  
    String nombre = teclado.nextLine();
    System.out.print("Selecciona tu puesto: \n 1 - Agente de servicio. \n 2 - Empleado de oficina. \n 3 - Directivo.");
    int puesto = 0;
    if(teclado.nextInt() != 1 && teclado.nextInt() != 2 && teclado.nextInt() != 3){
      System.out.print("La opción introducida no es valida"); 
    }
    else{
      puesto = teclado.nextInt();
    }
    System.out.print("Introduce el numero de horas trabajadas: ");  
    int nHoras = teclado.nextInt();
    System.out.print("Introduce tarifa horaria: ");  
    double tarifaHoraria = teclado.nextDouble();
    System.out.print("Introduce cuantos hijos tiene: ");  
    int nHijos = teclado.nextInt();
    int primaFamiliar = 0;

    if(nHoras > 180){
      h60 = nHoras - 180;
      nHoras = nHoras - h60;
    }
    if(nHoras > 169){
      h60 = nHoras - 169;
      nHoras = nHoras - h50;
    }
    
    brutoNomina = ((tarifaHoraria * nHoras) + (tarifaHoraria * 1.5 * h50) + (tarifaHoraria * 1.6 * h60));
    
    System.out.print("Nómina de " + nombre + " " + apellido);
    if(puesto == 1){
      estado = "Agente de servicio";
    }
    else if(puesto == 2){
      estado = "Empleado de oficina";
    }
    else{
      estado = "Directivo";
    }
    System.out.print("Estado " + estado);
    System.out.print("Salario bruto " + Math.round(brutoNomina * 100.0) / 100.0 + "€");
    System.out.print("Cálculo de deducciones: \n");

    double deudaSocial = (brutoNomina * 3.49) / 100;
    System.out.print(" - Contribución para el pago de la deuda social y contingencias comunes imponible \n" + Math.round(deudaSocial * 100.0) / 100.0 + "€");
    double conNoImp = (brutoNomina * 6.15) / 100;
    System.out.print(" - Contribución de contingencias comunes no imponible \n" + Math.round(conNoImp * 100.0) / 100.0 + "€");
    double sMedico = (brutoNomina * 0.95) / 100;
    System.out.print(" - Seguro médico \n" + Math.round(sMedico * 100.0) / 100.0 + "€");
    double fPensiones = (brutoNomina * 8.44) / 100;
    System.out.print(" - Fondo de pensiones \n" + Math.round(fPensiones * 100.0) / 100.0 + "€");
    double sDesempleo = (brutoNomina * 3.05) / 100;
    System.out.print(" - Seguro de desempleo \n" + Math.round(sDesempleo * 100.0) / 100.0 + "€");
    double pensionCompl = (brutoNomina * 3.81) / 100;
    System.out.print(" - Pensión complementaria (Entidad privada) \n" + Math.round(pensionCompl * 100.0) / 100.0 + "€");
    double contriJubilacion = (brutoNomina * 1.02) / 100;
    System.out.print(" - Contribución de jubilación anticipada \n" + Math.round(contriJubilacion * 100.0) / 100.0 + "€");
    double deduccionesTotales = deudaSocial + conNoImp + sMedico + fPensiones + sDesempleo + pensionCompl + contriJubilacion;
    System.out.print(" - Deducciones totales de los empleados: " + Math.round(deduccionesTotales * 100.0) / 100.0 + "€");
    double neto = brutoNomina - deduccionesTotales;
    System.out.print(" - Salario neto: \n" + Math.round(neto * 100.0) / 100.0 + "€");
    
    if(nHijos == 1){
      primaFamiliar = 20;
    }
    else if(nHijos == 2){
      primaFamiliar = 50;
    }
    else if(nHijos > 2){
      primaFamiliar = 70 + ((nHijos - 2) * 20);
    }
    System.out.print(" - Prima familiar: \n" + Math.round(primaFamiliar * 100.0) / 100.0 + "€");

    double netoPagar = neto + primaFamiliar;
    System.out.print(" - Salario neto a pagar: \n" + Math.round(netoPagar * 100.0) / 100.0 + "€");
    
    teclado.close();
  }  

}