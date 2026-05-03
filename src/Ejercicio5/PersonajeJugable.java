package Ejercicio5;

import java.io.PrintStream;

public abstract class PersonajeJugable extends SerVivo {
    public PersonajeJugable(double var1, double var3, int var5) {
        super(var1, var3, var5);
    }

    public abstract void interactuarConEntorno();

    public void dibujar() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNombre();
        var10000.println("[HÉROE] Dibujando " + var10001 + " en (" + this.getX() + "," + this.getY() + ")");
    }
}
