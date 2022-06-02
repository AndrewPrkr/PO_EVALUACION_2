/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_arreglos;

/**
 *
 * @author saeol
 */
public class Eva2_11_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLOS: almacenan datos del mismop tipo consecutivos.
        //se pueden acceder por indices.
        //java :primer posicion 0 ,ultima cantidad de elementos -1.
        //java los arreglos son objetos
        int[] arreglo = new int[10];//arreglo con 10 enteros
        //como los usamos?
        arreglo[0] = 100;//el arreglo en la posiscion 0 le asignamos 100
        System.out.println("El arregla de la posicion 0 tiene un vallor de: " + arreglo[0]);
        arreglo[1] = 200;
        arreglo[2] = 200;
        arreglo[3] = 200;
        arreglo[4] = 200;
        arreglo[5] = 200;
        arreglo[6] = 200;
        arreglo[7] = 200;
        arreglo[8] = 200;
        arreglo[9] = 200;//ultima posicion
        System.out.println("El arreglo 9 vale:" + arreglo[9]);
        //No puede haber un arreglo 10 ya que nos pasamos y porque se empieza desde 0.
        
        
        
        
        
    }
    
}

class Persona{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
