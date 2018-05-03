/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import javax.swing.JLabel;

/**
 *
 * @author Jesus David
 */
public class Silla {
    
    public Silla(JLabel posi,boolean stat){
        posicion=posi;
        state=stat;
        
    }
    JLabel posicion;
    boolean state;
    String usuario;
}
