public class Mes { 
  public void mes(Scanner teclado){   
      System.out.print("Introduce el numero de mes: ");  
      int nmes = 0;
    
        try (Scanner teclado = new Scanner(System.in)){
            do{ 
                teclado.nextLine();
                switch (nmes){
                    case 1:
                    		System.out.println("Enero");
                        break;
                    case 2:
                    	  System.out.println("Febrero");
                        break;
                    case 3:
                    	  System.out.println("Marzo");
                        break;
                    case 4:
                    	  System.out.println("Abril");
                    	break;
                    case 5:
                    	  System.out.println("Mayo");
                        break;
                    case 6:
                         System.out.println("Junio");
                        break;
                    case 7:
                        System.out.println("Julio");
                        break;
                    case 8:
                    	  System.out.println("Agosto");
                      	break;
                    case 9:
                    	  System.out.println("Septiembre");
                        break;
                    case 10:
                         System.out.println("Octubre");
                        break;
                    case 11:
                        System.out.println("Noviembre");
                        break;
                    case 12:
                        System.out.println("Diciembre");
                        break;
 
                    default:
                        System.out.println("No existe esta opcion.");
                }
            } while (opcion != 12);
        }
    }
  }  
}