import java.util.ArrayList;

public class SistemaEcommercePro {
    void main() {
        ArrayList<PasarelaPago> historialPagos = new ArrayList<>();

        historialPagos.add (new TarjetaCredito());
        historialPagos.add (new PayPal());
        historialPagos.add  (new Criptomoneda());

        IO.println("=== Procesamiento Unificado de Pagos ===");

        for (PasarelaPago pago : historialPagos) {
            pago.procesarPago(250.0);
        }
    }
}
