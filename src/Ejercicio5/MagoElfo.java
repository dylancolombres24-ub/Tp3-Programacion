package Ejercicio5;

import java.io.PrintStream;

public class MagoElfo extends PersonajeJugable implements LanzadorDeHechizos {
    public MagoElfo(double var1, double var3) {
        super(var1, var3, 100);
    }

    public String getNombre() {
        return "Mago Elfo";
    }

    public void interactuarConEntorno() {
        System.out.println(this.getNombre() + " lanza un rayo de energía!");
    }

    public void lanzarHechizo(String var1) {
        PrintStream var10000 = System.out;
        String var10001 = this.getNombre();
        var10000.println(var10001 + " conjura: ✨ " + var1 + " ✨");
    }
}
