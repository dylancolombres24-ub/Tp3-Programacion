package Ejercicio2;

interface Facturable {
    double calcularCostoMensual();
}

abstract class Suscripcion implements Facturable {
    protected String email;
    protected int nroCliente;
    protected double costoBase;

    public Suscripcion(String email, int nroCliente, double costoBase) {
        this.email = email;
        this.nroCliente = nroCliente;
        this.costoBase = costoBase;
    }

    public void mostrarDatos() {
        IO.print("Cliente: " + nroCliente + " (" + email + ") -> ");
    }
}
