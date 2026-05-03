package Ejercicio2;

class PlanPremium extends Suscripcion {
    private final double CARGO_4K_OFFLINE = 500.0;

    public PlanPremium(String email, int nroCliente, double costoBase) {
        super(email, nroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + CARGO_4K_OFFLINE;
    }
}
