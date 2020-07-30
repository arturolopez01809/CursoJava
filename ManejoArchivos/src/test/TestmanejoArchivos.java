package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestmanejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";//Si el nombre es distinto se crean dos archivos diferentes 
        //crearArchivo(nombreArchivo);
         
        escribirArchivo(nombreArchivo, "Hola desde Java");
        anexarArchivo(nombreArchivo, "adios"); //Sobreescribe la informacion
        leerArchivo(nombreArchivo);
    }
}
