class PayPal extends PasarelaPago {
    public PayPal() {
        super("PayPal Digital Wallet");
    }

    @Override
    public boolean validarConexion() {
        IO.println("[Validacion] Verificando token de sesion y correo del usuario...");
        return true;
    }

    @Override
    public void procesarPago(double monto) {
        mostrarCabecera();
        if (validarConexion());
        IO.println("Pago de $" + monto + " aprobado por PayPal.");
    }
}