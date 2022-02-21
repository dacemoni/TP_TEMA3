import java.util.*; 
public class Nomina {  
  public void nomina(Scanner teclado){ 
    
      Scanner teclado = new Scanner(System.in);  
      System.out.print("Introduce tu apellido: ");  
      String apellido = teclado.nextLine();
      System.out.print("Introduce tu nombre: ");  
      String nombre = teclado.nextLine();
      System.out.print("Selecciona tu puesto: \n 1 - Agente de servicio \n 2 - Empleado de oficina \n 3 - Directivo");  
      int puesto = teclado.nextLine();
      System.out.print("Introduce el numero de horas trabajadas: ");  
      int nHoras = teclado.nextLine();
      System.out.print("Introduce tu tarifa horaria: ");  
      double tarifaHoraria = teclado.nextLine();
      System.out.print("Introduce cuantos hijos tiene: ");  
      int nHijos = teclado.nextLine();
    
    

      teclado.close();
  }  

}