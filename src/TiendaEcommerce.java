import java.util.Scanner;

public class TiendaEcommerce {
    void main(){
        Scanner teclado = new Scanner(System.in);

        MetodoPago pagoElegido = null;

        IO.println("=== Carrito de compras virtual ===");
        IO.print("Ingrese el monto total de la compra: ");
        double total = teclado.nextDouble();

        IO.println("\nSeleccione su metodo de pago: ");
        IO.println("1. Tarjeta de credito");
        IO.println("2. PayPal");
        IO.println("3. Criptomonedas");
        IO.print("Opcion: ");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                pagoElegido = new TarjetaCredito();
                break;
            case 2:
                pagoElegido = new PayPal();
                break;
            case 3:
                pagoElegido = new Criptomoneda();
                break;
            default:
        IO.println("Opcion no valida");
        }

        if (pagoElegido != null){
            pagoElegido.procesarPago(total);
        }

        IO.println("\nGracias por su compra.");
        teclado.close();
    }
}