//package

import java.util.*;
public class Main {
  public static void main(String[] args) {
    int option;
    Scanner teclado = new Scanner(System.in);
    do{
      System.out.println("Elija el ejercicio.");
      menu();
      option = teclado.nextInt();
      switch(option){
        case 1:
          tiempo(teclado);
          break;
        case 2:
          eltiempo(teclado);
          break;
        case 3:
          mes(teclado);
          break;
        case 4:
          cocina(teclado);
          break;
        case 5:
          nomina(teclado);
          break;
        case 6:
          System.out.println("Gracias.");
          break;
        default:
          System.out.println("El indice introducido no coincide con alguna opción.");
          break;
      }
    } while(option!=6);
  }
  private static void menu(){
     System.out.println("1. El Tiempo.");
     System.out.println("2. El Tiempo ampliado.");
     System.out.println("3. Mes correspondiente.");
     System.out.println("4. Cocinado.");
     System.out.println("5. Nómina.");
     System.out.println("6. Salir.");
  }
}