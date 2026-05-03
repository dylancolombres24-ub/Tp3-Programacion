package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

class Controlador {
    public static void main() {
        List<DispositivoInteligente> dispositivos = new ArrayList<>();
        dispositivos.add(new CamaraSeguridad("Camara Seguridad", 8.0));
        dispositivos.add(new Termostato("Termostato Sala", 24));
        dispositivos.add(new SmartPhone("Smartphone", "Galaxy S23+"));

        System.out.println("-----------------------");
        System.out.println("REPORTE DE DISPOSITIVOS");
        System.out.println("-----------------------");
        System.out.println();

        for (DispositivoInteligente d : dispositivos) {
            d.mostrarInfo();
            System.out.println();
        }

        System.out.println("-----------------------------");
        System.out.println("CONECTANDO DISPOSITIVOS WIFI");
        System.out.println("-----------------------------");
        System.out.println();

        for (DispositivoInteligente d : dispositivos) {
            if (d instanceof ConectableWiFi) {
                ((ConectableWiFi) d).conectarseAWiFi("CasaSmart");
            }
        }

        System.out.println();
        System.out.println("Total de dispositivos: " + dispositivos.size());
    }
}
