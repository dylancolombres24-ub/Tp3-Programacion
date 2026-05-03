package Ejercicio5;

import java.io.PrintStream;

public class Dragon extends MonstruoHostil implements LanzadorDeHechizos {
    public Dragon(double var1, double var3) {
        super(var1, var3, 300);
    }

    public String getNombre() {
        return "Dragón";
    }

    public void atacar() {
        System.out.println(this.getNombre() + " exhala fuego devastador!");
    }

    public void lanzarHechizo(String var1) {
        PrintStream var10000 = System.out;
        String var10001 = this.getNombre();
        var10000.println(var10001 + " ruge e invoca: \ud83d\udd25 " + var1 + " \ud83d\udd25");
    }
}

