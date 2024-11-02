
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
       var entrada = new Scanner(System.in);
       
       System.out.print("Señor Usuario, ingrese el primer número por favor: ");
       var n1 = entrada.nextInt();
       System.out.print("Señor Uusario, ingrese el segundo número por favor: ");
       var n2= entrada.nextInt();
       var resultSuma = n1+ n2;
       var resultResta = n1- n2;
       var resultMulti = n1*n2;
       var resultDiv = n1/n2;
       System.out.println("El resultado de sumar los dos números es: "+resultSuma);
       System.out.println("El resultado de restar los dos números es: "+resultResta);
       System.out.println("El resultado de multiplicar los dos números es: "+resultMulti);
       System.out.println("El resultado de dividir los dos números es: "+resultDiv);
       entrada.close(); 

    }
}
