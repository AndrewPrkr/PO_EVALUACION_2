/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_interfaces;

/**
 *
 * @author saeol
 */
public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona est = new persona();
        est.setEdad(18);
        est.setNombre("Andres");
        est.imprimirDatos();
        
        Vehiculo carro = new Vehiculo();
        carro.setMarca("Chevrolet");
        carro.setModelo("2021");
        carro.imprimirDatos();
        carro.mostrarMensaje();
        // MuestraDatos datos = new MuestraDatos();
        
        // TODO code application logic here
    }
    
}
    class persona implements MuestraDatos{
        private String nombre;
        private int Edad;
        
        public persona (){
            
        }

    public persona(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
        @Override
    public void imprimirDatos(){
            System.out.println("Nombre" + nombre);
            System.out.println("Edad" + Edad);
        
    }
   

            
        
}
    class Vehiculo implements MuestraDatos, Mensaje{
        private String Marca;
        private String Modelo;

        public Vehiculo() {
        }

        public Vehiculo(String Marca, String Modelo) {
            this.Marca = Marca;
            this.Modelo = Modelo;
        }

        public String getMarca() {
            return Marca;
        }

        public String getModelo() {
            return Modelo;
        }

        public void setMarca(String Marca) {
            this.Marca = Marca;
        }

        public void setModelo(String Modelo) {
            this.Modelo = Modelo;
        }

        @Override
        public void imprimirDatos() {
            System.out.println("Modelo "+ Modelo);
            System.out.println("Marca "+ Marca);
            
        }

    @Override
    public void mostrarMensaje() {
        System.out.println("Que bonito carro");
    }
        
        
        
        
    }
 //poner metodos comunes a varias clases para poder replicarlas
interface MuestraDatos{
    //SOLO ACEPTAN METODO PUBLICOS
    //SOLO ACEPTAN DECLARACIONES DE METODOS--> solo acepta metodos abstractos
    public void imprimirDatos();
    
}
class Algo{
    
}

interface Mensaje{
    public void mostrarMensaje();
    
}


