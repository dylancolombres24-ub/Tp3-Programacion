class Criptomoneda implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        IO.println("\nBlockchain network");
        IO.println("-> Generando direccion de wallet temporal...");
        IO.println("-> Esperando 3 confirmaciones de la red...");
        IO.println("Pago de $" + monto + " En cripto confirmado.");
    }
}
