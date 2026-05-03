package Ejercicio4;

public abstract class DispositivoInteligente {
    private String nombre;

    public DispositivoInteligente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract void mostrarInfo();
}