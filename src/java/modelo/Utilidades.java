/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW203
 */
public class Utilidades {
    
    public static ArrayList<String> getAngulos(){
        ArrayList<String> angulos = new ArrayList<String>();
        for(int i=0; i<19; i++){
            angulos.add(String.valueOf(i*10));
        }
        return angulos;
    }
    
    public static double getRadianes(int angulo){
        double anguloenradianes = 0;
        anguloenradianes = (double) (angulo * Math.PI/180);
        return anguloenradianes;
    }
    
    public static ArrayList<Coordenada> generaCoordenadas(double alcance_max, double vel_inicial, int angulo){
        double intervalo = alcance_max /10;
        ArrayList<Coordenada> listaCoordenadas = new ArrayList<Coordenada>();
        for(int i=0; i<10; i++){
            double x = i * intervalo;
            double y = x * Math.tan(Utilidades.getRadianes(angulo)) - 9.8 * Math.pow(x, 2)/(2 * Math.pow(vel_inicial, 2) * Math.pow(Math.cos(getRadianes(angulo)), 2));
            Coordenada micoordenada = new Coordenada(x, y);
            listaCoordenadas.add(micoordenada);
        }
        return listaCoordenadas;
    }
}
