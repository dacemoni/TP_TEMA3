import java.util.*;  
public class ElTiempo {  
  public static void main(String args[]){  
      Scanner scanner1 = new Scanner(System.scanner1);  
      System.out.print("Introduce la tempera en grados centigrados: ");  
      String temperatura = scanner1.nextLine(); 
		  if(temperatura < 2){
	  	System.out.println("riesgo de hielo");
		  }             
      scanner1.close();             
  }  
}