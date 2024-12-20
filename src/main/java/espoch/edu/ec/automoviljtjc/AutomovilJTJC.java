/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.automoviljtjc;

import espoch.edu.ec.automoviljtjc.Caracteristicas.ColorAuto;
import espoch.edu.ec.automoviljtjc.Caracteristicas.PropiedadesAuto;
import espoch.edu.ec.automoviljtjc.Caracteristicas.TipoAutomovil;
import espoch.edu.ec.automoviljtjc.Caracteristicas.TipoCombustible;

/**
 *
 * @author Global Technology Ec
 */
public class AutomovilJTJC {

    public static void main(String[] args) {
        PropiedadesAuto miAuto = new PropiedadesAuto();

        miAuto.setMarca("Toyota");
        miAuto.setModelo("Tundra 2023");
        miAuto.setMotor(3.6);
        miAuto.setTipoCombustible(TipoCombustible.GASOLINA);
        miAuto.setTipoAutomovil(TipoAutomovil.CAMIONETA);
        miAuto.setNumeroPuertas(4);
        miAuto.setCantidadAsientos(5);
        miAuto.setVelocidadMaxima(280);
        miAuto.setColor(ColorAuto.NEGRO);
        miAuto.mostrarAtributos();
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
