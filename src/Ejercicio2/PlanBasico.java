package Ejercicio2;

public class PlanBasico extends Suscripcion {
    public PlanBasico(String email, int nroCliente, double costoBase) {
        super(email, nroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase;
    }
}
