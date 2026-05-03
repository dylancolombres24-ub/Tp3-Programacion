package Ejercicio4;

public class SmartPhone extends DispositivoInteligente implements Fotografiable, ConectableWiFi {
    private String modelo;

    public SmartPhone(String nombre, String modelo) {
        super(nombre);
        this.modelo = modelo;
    }

    @Override
    public void tomarFotografia() {
        System.out.println(getNombre() + " tomó una fotografía.");
    }

    @Override
    public void conectarseAWiFi(String nombreRed) {
        System.out.println(getNombre() + " conectado a la red: " + nombreRed);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("-SMARTPHONE-");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Modelo: " + modelo);
    }
}

