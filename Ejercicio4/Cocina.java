import java.util.*;  
public class Cocina { 
  public void cocina(Scanner teclado){ 
      Scanner teclado = new Scanner(System.in);  
      System.out.print("Introduce el tipo de carne que va a cocinar: ");  
      String tipoCarne = teclado.nextLine();
      System.out.print("Introduce el peso de la carne en gramos: ");  
      int pesoCarne = teclado.nextLine();
      System.out.print("Introduce el tipo de cocción que desea para la carne: ");  
      String coccionCarne = teclado.nextLine();
    
      if(tipoCarne.equals("vacuno")){
			  if(coccionCarne.equals("casi cruda")){
          System.out.println("El tiempo que necesita para su cocinado es de 10 minutos");
        }
        else if(coccionCarne.equals("al punto")){
          System.out.println("El tiempo que necesita para su cocinado es de 17 minutos");
        }
        else if(coccionCarne.equals("bien hecha")){
          System.out.println("El tiempo que necesita para su cocinado es de 25 minutos");
        }
        else{
          System.out.println("Tipo de coccion incorrecto.");
        }
		  } 
      else if (tipoCarne.equals("cordero")){
        if(coccionCarne.equals("casi cruda")){
          System.out.println("El tiempo que necesita para su cocinado es de 15 minutos");
        }
        else if(coccionCarne.equals("al punto")){
          System.out.println("El tiempo que necesita para su cocinado es de 25 minutos");
        }
        else if(coccionCarne.equals("bien hecha")){
          System.out.println("El tiempo que necesita para su cocinado es de 40 minutos");
        }
        else{
          System.out.println("Tipo de coccion incorrecto.");
        }
      }
      else {
        System.out.println("Tipo de carne no existente.");
      }
      teclado.close();
  }  
}