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
}
