package Ejercicio5;

public class Orco extends MonstruoHostil {
    public Orco(double var1, double var3) {
        super(var1, var3, 120);
    }

    public String getNombre() {
        return "Orco";
    }

    public void atacar() {
        System.out.println(this.getNombre() + " golpea brutalmente con su maza!");
    }
}

