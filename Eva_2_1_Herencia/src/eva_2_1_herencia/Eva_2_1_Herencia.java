/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_1_herencia;

/**
 *
 * @author saeol
 */
public class Eva_2_1_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //metodos en negritas son metodos propios cuando no estan en negritas estan heredados.
       
        Maestro mtro1 = new Maestro ();
        mtro1.imprimirDatos();
        
    }
    
}
//Subclase hijo
class Maestro extends Persona{
private String No_Registro;
    public Maestro(){    
    
    super();
    System.out.println ("CLASE MAESTRO");
    
    
}
    public Maestro (String nombre, int edad, String No_Registro){
        super(nombre,edad);//Llamada al constructor SUPERCLASE
        this.No_Registro = No_Registro;
        
    }

    public String getNo_Registro() {
        return No_Registro;
    }

    public void setNo_Registro(String No_Registro) {
        this.No_Registro = No_Registro;
    }
    //Override --> ignora el metodo con el mismo nombre de la superclase y lo sustituye con el metodo\
    //de la subclase
   
            
            class Estudiante extends {
    //extends toma los atributosd de clase persona y los extiende a la nueva clase
    private String numerodecontrol;

    public String getNumerodecontrol() {
        return numerodecontrol;
    }

    public void setNumerodecontrol(String numerodecontrol) {
        this.numerodecontrol = numerodecontrol;
    }
    @Override
    public void imprimirDATOS(){
        super.imprimirDATOS();//SE LLAMA AL METOFO IMPRIMIR DATOS DE PERSONA
        System.out.println("No. de control" + numerodecontrol);
        
    }
    
}

class Persona{//super clase --> calse padre
              //subclase --> calse hijo
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "xxxx";
        this.edad = 100000;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimirDATOS(){
        System.out.println("Nombre"+ nombre);
        System.out.println("edad"+ edad);
    }
    
}}
