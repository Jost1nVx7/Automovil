/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.automoviljtjc;

import espoch.edu.ec.automoviljtjc.PropiedadesAuto.PropiedadesAuto;

/**
 *
 * @author Global Technology Ec
 */
public class Automovil {

    public static void main(String[] args) {
        
        PropiedadesAuto miAuto = new PropiedadesAuto();

        miAuto.setVelocidadMaxima(280);
        miAuto.setVelocidadActual(100);
        miAuto.acelerar(20);
        miAuto.desacelerar(50);
        double tiempoEstimado = miAuto.TiempoEstimadoLlegada(200);
        if (tiempoEstimado == Double.POSITIVE_INFINITY) {
            System.out.println("El automovil esta detenido. No se puede calcular el tiempo estimado de llegada.");
        } else {
            System.out.println("Tiempo estimado de llegada: " + tiempoEstimado + " horas");
        }
        miAuto.frenar();

    }
}
    
