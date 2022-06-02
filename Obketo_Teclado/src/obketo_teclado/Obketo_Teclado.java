/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obketo_teclado;

/**
 *
 * @author saeol
 */
public class Obketo_Teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        teclado asus = new teclado();
        asus.formato = "completo";
        asus.keycaps = "PBT";
        asus.rgb = "Si tiene RGB";
        asus.suitches = "RED";
        
        System.out.println("Tu teclado es el asus");
        System.out.println("El formato de tu teclado es " + asus.formato);
        System.out.println("Las Keycaps del teclado son: " + asus.keycaps);
        System.out.println("Iluminacion RGB" + asus.rgb);
        System.out.println("Los switches son" + asus.suitches);
        
        // TODO code application logic here
    }
    
}

class teclado
{
    String keycaps;
    String switches;
    String suitches;
    String rgb;
    String formato;
    
}