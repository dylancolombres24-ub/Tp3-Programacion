package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EntidadEspacial> entidades = new ArrayList<>();

        GuerreroHumano guerrero = new GuerreroHumano(0, 0);
        MagoElfo mago = new MagoElfo(5, 3);
        Orco orco = new Orco(10, 10);
        Dragon dragon = new Dragon(20, 15);

        entidades.add(guerrero);
        entidades.add(mago);
        entidades.add(orco);
        entidades.add(dragon);

        // 1. Actualizar coordenadas de TODAS las entidades
        System.out.println("===== ACTUALIZAR COORDENADAS =====");
        for (EntidadEspacial e : entidades) {
            e.actualizarCoordenadas(e.getX() + 1, e.getY() + 1);
        }

        // 2. Calcular supervivencia de los seres vivos
        System.out.println("\n===== SUPERVIVENCIA DE SERES VIVOS =====");
        for (EntidadEspacial e : entidades) {
            if (e instanceof SerVivo) {
                SerVivo sv = (SerVivo) e;
                sv.recibirDanio(50);
                System.out.println(sv.getNombre() + " - ¿Vivo? " + (sv.estaVivo() ? "Sí" : "No"));
            }
        }

        // 3. Solo los que saben magia lanzan hechizos
        System.out.println("\n===== ATAQUES MÁGICOS =====");
        for (EntidadEspacial e : entidades) {
            if (e instanceof LanzadorDeHechizos) {
                ((LanzadorDeHechizos) e).lanzarHechizo("Bola de Fuego");
            }
        }
    }
}


