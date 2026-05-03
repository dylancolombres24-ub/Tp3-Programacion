package Ejercicio5;

public abstract class EntidadEspacial {
    private double x;
    private double y;

    public EntidadEspacial(double var1, double var3) {
        this.x = var1;
        this.y = var3;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void actualizarCoordenadas(double var1, double var3) {
        this.x = var1;
        this.y = var3;
        System.out.println(this.getNombre() + " se movió a (" + var1 + ", " + var3 + ")");
    }

    public abstract void dibujar();

    public abstract String getNombre();
}

