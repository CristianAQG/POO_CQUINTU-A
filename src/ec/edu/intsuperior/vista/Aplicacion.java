
package ec.edu.intsuperior.vista;

import ec.edu.intesuperior.modelo.ClaseA;

public class Aplicacion {
    public static void main (String[]args){
        ClaseA.caminar();
        ClaseA obj= new ClaseA();
        obj.vacilar();
        System.out.println((obj.estudiar));
        
    }
}
