/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_metodos_abstractos;

/**
 *
 * @author saeol
 */
public class Eva2_10_Metodos_Abstractos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
    class ImplementaAbstracto extends ClaseAbstracta{

    @Override
    public void metodoAbstracto() {
    }
    
}
//Metodo abstracto: sin cuerpo(sin implementacion).
//las clases estas disenadas para crear objetos.
abstract class ClaseAbstracta{
    public void metodoImplementado(){
        System.out.println("Metodo Implementado");
    }
    public abstract void metodoAbstracto();
    
}


