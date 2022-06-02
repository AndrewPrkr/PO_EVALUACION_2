/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creardatos_computadora;

/**
 *
 * @author saeol
 */
public class CREARDATOS_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Comp pc1 = new Comp(); 
        
        pc1.GPU = "1070ti";
        pc1.mobo = "B450F";
        pc1.procesador = "Ryzen 5 3600";
        System.out.println("Tu computadora es la pc1");
        System.out.println("Su GPU es:" + pc1.GPU);
        System.out.println("Su tarjeta madre es: " + pc1.mobo);
        System.out.println("Su procesador es: " + pc1.procesador);
        
        Comp pc2 = new Comp();
        pc2.GPU = "3060ti";
        pc2.mobo = "Z390";
        pc2.procesador = "Intel core i9 9900k";
        
        System.out.println("Tu computadora es la pc2");
        System.out.println("Su GPU es:" + pc2.GPU);
        System.out.println("Su tarjeta madre es: " + pc2.mobo);
        System.out.println("Su procesador es: " + pc2.procesador);
        
        // TODO code application logic here
    }
    
}

    class Comp
    {String procesador;
    String mobo;
    String GPU;
 
}


