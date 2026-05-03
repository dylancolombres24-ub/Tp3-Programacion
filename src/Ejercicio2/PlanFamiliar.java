package Ejercicio2;

class PlanFamiliar extends Suscripcion {
    private int perfilesAdicionales;
    private final double RECARGO_PERFIL = 200.0;

    public PlanFamiliar(String email, int nroCliente, double costoBase, int perfiles) {
        super(email, nroCliente, costoBase);
        this.perfilesAdicionales = perfiles;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + (perfilesAdicionales * RECARGO_PERFIL);
    }
}
