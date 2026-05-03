package Ejercicio5;

public class GuerreroHumano extends PersonajeJugable {
    public GuerreroHumano(double var1, double var3) {
        super(var1, var3, 150);
    }

    public String getNombre() {
        return "Guerrero Humano";
    }

    public void interactuarConEntorno() {
        System.out.println(this.getNombre() + " golpea con su espada!");
    }
}