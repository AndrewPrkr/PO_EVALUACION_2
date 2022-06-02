/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_herencia_2;

/**
 *
 * @author saeol
 */
public class EVA_2_HERENCIA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Direccion dire = new Estudiante.Direccion("asdf", 3245, "asdf", "asdf", "asdfasd", "asdfasdf", "asdfasdfasfd");
        
        // TODO code application logic here
    
    
    
}
class Persona{
        private String nombre;
        private int edad;

    public Persona() {
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
    public void imprimirDatos(){
        System.out.println("Nombre "+ nombre);
        System.out.println("Edad "+ edad);
        
    }
   
    
} class Estudiante extends Persona{
        private String numeroControl;
        //Esto es un objeto sin instanciar
        
        private Direccion direccion;
      
        public Estudiante(){
        super();
        this.numeroControl = "";
        //instanciar direccion
        direccion = new Direccion();
        direccion.imprimirDireccion();
        
    }
    
       

    public Estudiante(String numeroControl, Direccion direccion) {
        super();
        this.numeroControl = numeroControl;
        this.direccion = direccion;
        
    }
        

        public String getNumeroControl() {
            return numeroControl;
        }

        public void setNumeroControl(String numeroControl) {
            this.numeroControl = numeroControl;
        
            
        }
        @Override
                public void imprimirDatos(){
                    System.out.println("Numero de control " + numeroControl);
                    super.imprimirDatos();
                }
         
class Direccion{
private String calle;
private int numer;
private String colonia;
private String cp;
private String ciudad;
private String estado;
private String telefono;

        public Direccion(String calle, int numer, String colonia, String cp, String ciudad, String estado, String telefono) {
            this.calle = calle;
            this.numer = numer;
            this.colonia = colonia;
            this.cp = cp;
            this.ciudad = ciudad;
            this.estado = estado;
            this.telefono = telefono;
            
            
        }

        private Direccion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        

        public String getCalle() {
            return calle;
        }

        public int getNumer() {
            return numer;
        }

        public String getColonia() {
            return colonia;
        }

        public String getCp() {
            return cp;
        }

        public String getCiudad() {
            return ciudad;
        }

        public String getEstado() {
            return estado;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public void setNumer(int numer) {
            this.numer = numer;
        }

        public void setColonia(String colonia) {
            this.colonia = colonia;
        }

        public void setCp(String cp) {
            this.cp = cp;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        public void imprimirDireccion(){
            System.out.println("calle "+ calle + "#" + numer );
        }
        

}
}
}

    

