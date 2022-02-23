import java.util.*; 
public class Nomina {  
  public void nomina(Scanner teclado){ 
    Scanner teclado = new Scanner(System.in);
    double brutoNomina; 
    int h60 = 0;
    int h50 = 0;
    System.out.print("Introduce apellido: ");  
    String apellido = teclado.nextLine();
    System.out.print("Introduce nombre: ");  
    String nombre = teclado.nextLine();
    System.out.print("Selecciona tu puesto: \n 1 - Agente de servicio. \n 2 - Empleado de oficina. \n 3 - Directivo.");  
    int puesto = teclado.nextInt();
    System.out.print("Introduce el numero de horas trabajadas: ");  
    int nHoras = teclado.nextInt();
    System.out.print("Introduce tarifa horaria: ");  
    double tarifaHoraria = teclado.nextDouble();
    System.out.print("Introduce cuantos hijos tiene: ");  
    int nHijos = teclado.nextInt();

    if(nHoras > 180){
      h60 = nHoras - 180;
      nHoras = nHoras - h60;
    }
    if(nHoras > 169){
      h60 = nHoras - 169;
      nHoras = nHoras - h50;
    }
    
    brutoNomina = ((tarifaHoraria * nHoras) + (tarifaHoraria * 1.5 * h50) + (tarifaHoraria * 1.6 * h60));

      teclado.close();
  }  

}