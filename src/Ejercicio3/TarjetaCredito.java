package Ejercicio3;

class TarjetaCredito extends PasarelaPago {
    public TarjetaCredito() {
        super("Red Bancaria Visa/Mastercard");
    }

    @Override
    public boolean validarConexion() {
        IO.println("Verificando terminal bancara...");
        return true;
    }

    @Override
    public void procesarPago(double monto) {
        mostrarCabecera();
        if (validarConexion());
        IO.println("Cobro de $" + monto + " asentado en cuenta");
    }
}
