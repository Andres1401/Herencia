/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class Alumnos {
    
    protected char sexo;
    protected int edad;
    protected String nombre;

    public Alumnos(char sexo, int edad, String nombre) {
        this.sexo = sexo;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    
    public void grado(){
        System.out.println("Estoy en tal x grado");
    }
    
}
