class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto){
        IO.println("\nApi PayPal");
        IO.println("-> Redirigiendo al usuario a la pagina de PayPal...");
        IO.println("-> Token de autorizacion...");
        IO.println("Pago de $" + monto + " Por PayPal aprobado.");
    }
}
