
import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
    var entrada = new Scanner(System.in);
    System.out.println("Señor usuario, por favor digite el primer número");
    var n1= entrada.nextInt();
    System.out.println("Señor usuario, por favor digite el segundo número");
    var n2= entrada.nextInt(); 
    System.out.println("Señor usuario, por favor digite el tercer número");
    var n3= entrada.nextInt();
    var resultSuma=n1+n2+n3;
    var mediaArit= resultSuma/3; 
    System.out.println("La media aritmética de los 3 números ingresados es: "+mediaArit);

    entrada.close();
}
}
