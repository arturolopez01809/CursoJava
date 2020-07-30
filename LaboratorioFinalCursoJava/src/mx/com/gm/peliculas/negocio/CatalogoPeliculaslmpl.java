package mx.com.gm.peliculas.negocio;

import java.io.*;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculaslmpl implements CatalogoPeliculas{
    
    private final AccesoDatos datos;
    
    public CatalogoPeliculaslmpl(){
        this.datos = new AccesoDatoslmpl();
    }
    
    @Override
    public void agregarpelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error de acceso a datos");
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            
            for(var pelicula: peliculas){
                System.out.println("Pelicula = " + pelicula);
            }
            
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
        } finally{
            System.out.println("Resultado = " + resultado);
        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void eliminarArchivo(String nombreArchivo) {
        
        try {
            if(!this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            Logger.getLogger(CatalogoPeliculaslmpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
