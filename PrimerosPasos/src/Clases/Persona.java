package Clases;

public class Persona {
    //Atributos de la clase
    String nombre;
    String apellido;
    
    public void desplegarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
}
