import java.util.*;  
public class Tiempo {
  public void tiempo(){
      Scanner scanner1 = new Scanner(System.in);  
      System.out.print("Introduce la tempera en grados centigrados: ");  
      int temperatura = scanner1.nextInt();
		  if(temperatura < 2){
			  System.out.println("riesgo de hielo");
		  }             
      scanner1.close();             
    }
}
