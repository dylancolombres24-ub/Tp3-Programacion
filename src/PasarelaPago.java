interface Validable {
        boolean validarConexion();
    }

    interface Procesable {
        void procesarPago(double monto);
    }

    abstract class PasarelaPago implements Procesable, Validable {
    protected  String nombrePlataforma;

    public PasarelaPago(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public void mostrarCabecera() {
        IO.println("\n--- Iniciando Pago Via: " + nombrePlataforma + " ---");
    }
}


