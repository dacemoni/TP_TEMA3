import java.util.*;

public class Tiempo {
  public void tiempo(Scanner teclado){
      Scanner scanner1 = new Scanner(System.in);  
      System.out.print("Introduce la tempera en grados centigrados: ");  
      int temperatura = scanner1.nextInt();
		  if(temperatura < 2){
			  System.out.println("Riesgo de hielo");
		  }  
      else{
        System.out.println("No existe riesgo de hielo");
      }
      scanner1.close();             
    }
}