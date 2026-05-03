package Ejercicio5;

import java.io.PrintStream;

public abstract class MonstruoHostil extends SerVivo {
    public MonstruoHostil(double var1, double var3, int var5) {
        super(var1, var3, var5);
    }

    public abstract void atacar();

    public void dibujar() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNombre();
        var10000.println("[MONSTRUO] Dibujando " + var10001 + " en (" + this.getX() + "," + this.getY() + ")");
    }
}
