/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW203
 */
public class Tiro {
    public int velocidadinicial;
    public int angulo;
    public double gravedad;
    public double maxalcance;
    public double maxaltura;

    public Tiro(int velocidadinicial, int angulo) {
        this.velocidadinicial = velocidadinicial;
        this.angulo = angulo;
        this.gravedad = 9.8;
        this.maxalcance = Math.pow(velocidadinicial, 2) * (Math.sin(2 * Utilidades.getRadianes(angulo))) / 9.8;
        this.maxaltura = Math.pow(velocidadinicial, 2) * Math.pow(Math.sin(Utilidades.getRadianes(angulo)), 2) / 2 * 9.8;
    }

    public int getVelocidadinicial() {
        return velocidadinicial;
    }

    public void setVelocidadinicial(int velocidadinicial) {
        this.velocidadinicial = velocidadinicial;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public double getMaxalcance() {
        return maxalcance;
    }

    public void setMaxalcance(double maxalcance) {
        this.maxalcance = maxalcance;
    }

    public double getMaxaltura() {
        return maxaltura;
    }

    public void setMaxaltura(double maxaltura) {
        this.maxaltura = maxaltura;
    }
    
    
    
    
}
