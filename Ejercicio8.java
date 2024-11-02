
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    var entrada = new Scanner(System.in);
       
     System.out.println("Señor usuario, por favor digite la longitud del rectángulo");
        var n1= entrada.nextInt();
        System.out.println("Señor usuario, por favor digite el ancho del rectángulo");
        var n2= entrada.nextInt(); 
        var areaTot = n1*n2; 
        var perimRect = ((n1*2)+(n2*2));
       System.out.println("El área del rectángulo es: "+" "+ areaTot+" "+"metros");
       System.out.println("El perímetro del rectángulo es: "+" "+ perimRect+" "+"metros");
       entrada.close();
    }
}
