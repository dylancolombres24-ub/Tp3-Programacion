interface MetodoPago {
    void procesarPago(double monto);
}

class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {

    IO.println("\nSistema Bancario");
        IO.println("-> Conectando con la pasrela de la tarjeta...");
        IO.println("-> Validando fondos y codigo de seguridad...");
        IO.println("Pago de $" + monto + " Con tarjeta exitoso.");
    }
}
