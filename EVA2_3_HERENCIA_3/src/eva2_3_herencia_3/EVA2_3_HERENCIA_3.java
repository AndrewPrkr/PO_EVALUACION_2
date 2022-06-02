 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_herencia_3;

/**
 *
 * @author saeol
 */
public class EVA2_3_HERENCIA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Animal animal = new Animal ();
       // animal.mover();
        //Vertebrado verte = new Vertebrado();
        //verte.TenerEsqueleto();
       // Mamifero mami = new Mamifero();
        //mami.Pelo();
        //mami.TenerEsqueleto();
       //Primates changos = new Primates();
       //changos.TienenPulgares();
       Humano persona = new Humano();
       persona.Razonar();
        
        
        // TODO code application logic here
    }
}



 class Humano extends Primates{
        public Humano(){
            super();
            System.out.println("Humanos");
        }
        public void Razonar(){
            System.out.println("Pueden razonar");
        }
    }
 class Primates extends Mamifero{
        public Primates(){
            super();
            System.out.println("Primates");
        }
        public void TienenPulgares(){
            System.out.println("Tienen pulgares");
        }
    }
    
    class Mamifero extends Vertebrado{
        public Mamifero(){
            super();// Llamamos a la super clase
            
            System.out.println("Mamifero");
        }
        public void Pelo(){
            System.out.println("Tienen pelo");
        }
    }
class Vertebrado extends Animal{
    
    public Vertebrado(){//Constructor
        super ();
        System.out.println("Vertebrtado");
                         
    }
    public void TenerEsqueleto(){                   
        System.out.println("Tienen esqueleto");
    }
    
}

class Animal{  //Super clase
    public Animal(){
        System.out.println("ANimal");
    }
    public void mover(){
        System.out.println("Animal : movimiento");
    }
}
