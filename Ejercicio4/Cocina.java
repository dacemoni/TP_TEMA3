import java.util.*;  
public class Cocina { 
  public void cocina(Scanner teclado){ 
      int resultado = 0;
      Scanner teclado = new Scanner(System.in);  
      System.out.print("Introduce el tipo de carne que va a cocinar: (vacuno/cordero)");  
      String tipoCarne = teclado.nextLine();
      System.out.print("Introduce el peso de la carne en gramos: ");  
      int pesoCarne = teclado.nextLine();
      System.out.print("Introduce el tipo de cocción que desea para la carne: (casi cruda / al punto / bien hecha)");  
      String coccionCarne = teclado.nextLine();
    
      if(tipoCarne.equals("vacuno")){
			  if(coccionCarne.equals("casi cruda")){
          resultado = (pesoCarne * 10 * 60)/500;
        }
        else if(coccionCarne.equals("al punto")){
          resultado = (pesoCarne * 17 * 60)/500;
        }
        else if(coccionCarne.equals("bien hecha")){
          resultado = (pesoCarne * 25 * 60)/500;
        }
        else{
          System.out.println("Tipo de cocción incorrecto.");
        }
		  } 
      else if (tipoCarne.equals("cordero")){
        if(coccionCarne.equals("casi cruda")){
          resultado = (pesoCarne * 15 * 60)/400;
        }
        else if(coccionCarne.equals("al punto")){
          resultado = (pesoCarne * 25 * 60)/400;
        }
        else if(coccionCarne.equals("bien hecha")){
          resultado = (pesoCarne * 40 * 60)/400;
        }
        else{
          System.out.println("Tipo de coccion incorrecto.");
        }
      }
      else {
        System.out.println("Tipo de carne no existente.");
      }
      System.out.println("El tiempo que necesita para su cocinado es: " + resultado "segundos.");
      teclado.close();
  }  
}