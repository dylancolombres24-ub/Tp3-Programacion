package Ejercicio2;

import java.util.ArrayList;

public class GestorStreaming {
    public static void main(String[] args) {
        ArrayList<Suscripcion> listaSuscripciones = new ArrayList<>();

        listaSuscripciones.add(new PlanBasico("tomas@gmail.com", 101, 1200.0));
        listaSuscripciones.add(new PlanFamiliar("familia_ferreyra@gmail.com", 102, 1200.0, 3));
        listaSuscripciones.add(new PlanPremium("sofia_cinefila@gmail.com", 103, 1200.0));

        double ingresosTotales = 0;

        IO.println("=== Reporte de Facturacion Mensual ===");

        for (Suscripcion s : listaSuscripciones){
            double costo = s.calcularCostoMensual();
            s.mostrarDatos();

            IO.println("Costo Final: $" + costo);
            ingresosTotales += costo;
        }

        IO.println("----------------------------------------");

        IO.println("Ingresos Totales de la Empresa: $" + ingresosTotales);
    }
}
