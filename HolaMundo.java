import java.util.Scanner;

public class HolaMundo {
    
public static void main(String[] args) {
    //imprimir datos en pantalla
    System.out.println("Hola Uber!");

    System.out.printf("Aquí va una cadena: %s%n",  "Uber Torres");
    System.out.printf("Aquí va un entero: %d%n", 15);
    System.out.printf("Mi nombre es %s y tengo %d años%n", "Uber Torres", 45);

  var entrada = new Scanner(System.in);
  System.out.print("Ingrese su nombre por favor: ");
  var entero = entrada.nextLine();
  System.out.println(entero);
 entrada.close();  
}
}