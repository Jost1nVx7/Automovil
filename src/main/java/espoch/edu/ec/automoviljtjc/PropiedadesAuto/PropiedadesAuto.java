/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.automoviljtjc.PropiedadesAuto;

/**
 *
 * @author COTAYA
 */
public class PropiedadesAuto {
    
    private double velocidadMaxima;
    private double velocidadActual;

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
   
    
    public void acelerar(double incremento) {

        double nvVelocidadAcelerar = velocidadActual + incremento;
        if (nvVelocidadAcelerar > velocidadMaxima) {
            System.out.println("No se puede acelerar mas alla de la velocidad maxima.");
        } else {
            velocidadActual = nvVelocidadAcelerar;
            System.out.println("Velocidad actual despues de acelerar: " + velocidadActual + " km/h");
        }
    }

    public void desacelerar(double decremento) {
        double nvVelocidadDesacelerar = velocidadActual - decremento;
        if (nvVelocidadDesacelerar < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        } else {
            velocidadActual = nvVelocidadDesacelerar;
            System.out.println("Velocidad actual despues de desacelerar: " + velocidadActual + " km/h");
        }
    }

    public double TiempoEstimadoLlegada(double distancia) {
        velocidadActual = velocidadActual;
        if (velocidadActual == 0) {
            System.out.println("El automovil esta detenido. No se puede calcular el tiempo estimado.");
            return velocidadActual;
        }
        return distancia / velocidadActual;
    }

    public void frenar() {
        velocidadActual = 0;  
        System.out.println("El automovil ha frenado. Velocidad actual: " + velocidadActual + " km/h");
    }
}


