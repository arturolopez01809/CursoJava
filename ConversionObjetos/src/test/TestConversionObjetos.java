package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        //System.out.println(empleado.obtenerDetalles());
        
        //downcasting convertir a la clase hija
        //((Escritor)empleado).getTipoEscritura();
        System.out.println("Tipo Escritura: " + ((Escritor)empleado).getTipoEscritura());
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Upcasting convertir a la clase padre
        Empleado empleado2 = escritor;
        System.out.println("empleado2 = " + empleado2);
        System.out.println(empleado2.obtenerDetalles());
    }
}
