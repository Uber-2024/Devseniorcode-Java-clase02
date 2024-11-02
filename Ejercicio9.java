import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese una temeperatura en grados celsius por favor");
        var grados= entrada.nextInt();
        var Fahrenheit = grados*9/5+32; //= Celsius * 9/5 + 32
        var Kelvin = grados+273.15; //Celsius + 273.15
        System.out.println("El equivalente en grados Fahrenheit a la temperatura ingresada es: "+Fahrenheit+"°");
        System.out.println("El equivalente en grados Kelvin a la temperatura ingresada es: "+Kelvin+"°");
        entrada.close();
        
        
    }
}
