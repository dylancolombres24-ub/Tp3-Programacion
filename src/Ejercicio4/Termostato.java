package Ejercicio4;

public class Termostato extends DispositivoInteligente implements ConectableWiFi {
    private double temperaturaObjetivo;

    public Termostato(String nombre, double temperaturaObjetivo) {
        super(nombre);
        this.temperaturaObjetivo = temperaturaObjetivo;
    }

    @Override
    public void conectarseAWiFi(String nombreRed) {
        System.out.println(getNombre() + " conectado a la red: " + nombreRed);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("-TERMOSTATO-");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Temperatura objetivo: " + temperaturaObjetivo + "°C");
    }
}