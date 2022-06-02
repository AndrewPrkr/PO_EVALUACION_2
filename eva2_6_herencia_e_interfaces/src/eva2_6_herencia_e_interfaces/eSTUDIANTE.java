/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_herencia_e_interfaces;

/**
 *
 * @author saeol
 */
public class eSTUDIANTE extends Persona implements MUESTRA_DATOS{
    private String NumeroCtrl;

    public eSTUDIANTE() {
        super();//constructor default
        this.NumeroCtrl= "";
        
    }

    public eSTUDIANTE(String NumeroCtrl, String nombre, int Edad) {
        super(nombre, Edad);//constructor de persona super clase
        this.NumeroCtrl = NumeroCtrl;
    }

    public String getNumeroCtrl() {
        return NumeroCtrl;
    }

    public void setNumeroCtrl(String NumeroCtrl) {
        this.NumeroCtrl = NumeroCtrl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Numero ctrl: " + NumeroCtrl );
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
