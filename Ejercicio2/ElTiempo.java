import java.util.*;  
public class ElTiempo {  
  public void eltiempo(Scanner teclado){ 
      Scanner scanner1 = new Scanner(System.scanner1);  
      System.out.print("Introduce la tempera en grados centigrados: ");  
      int temperatura = scanner1.nextLine();
      if(temperatura => 30){
			  System.out.println("Demasiado calor");
		  } 
      else if (temperatura => 15){
        System.out.println("Buena temperatura");
      }
      else if (temperatura => 2){
        System.out.println("Hace frío");
      }
      else if (temperatura < 2){
        System.out.println("Riesgo de hielo");
      }
      scanner1.close();
  }  
}