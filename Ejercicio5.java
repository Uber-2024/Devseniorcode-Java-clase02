public class Ejercicio5 {
    public static void main(String[] args) {
       System.out.println("Mostrar el precio final de un computador con un descuento del 10%");
        var prec= 660;
        System.out.println("El precio del computador sin descuento es: $"+prec);
       var  porcentj = 10;
       var desc = prec*porcentj/100;
       System.out.println("El descuento total es de: $" +desc);
       var precioTot = prec-desc;
       System.out.println("El precio total a pagar después del descuento es: $"+ precioTot);
        


    }
}
