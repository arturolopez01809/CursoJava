package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculaslmpl;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bucle = false;

        int opcion = 0;

        String nombreArchivo = "peliculas.txt";
            CatalogoPeliculas catalogopeliculas = new CatalogoPeliculaslmpl();
        
        while (!bucle) {

            System.out.println("1.- Iniciar catalogo películas");
            System.out.println("2.- Agregar película");
            System.out.println("3.- Listar películas");
            System.out.println("4.- Buscar películas");
            System.out.println("0.- Salir");

            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1) {
                catalogopeliculas.iniciarArchivo(nombreArchivo);
            } else if (opcion == 2) {
                String nombrePelicula = null;
                System.out.print("Introduzca una película: ");
                
                nombrePelicula = sc.nextLine();
                catalogopeliculas.agregarpelicula(nombrePelicula, nombreArchivo);
                
            } else if(opcion == 3){
                catalogopeliculas.listarPeliculas(nombreArchivo);
            } else if(opcion == 4){
                System.out.print("Introduzca la pelicula que quiera buscar: ");
                
                String nombrePelicula = sc.nextLine();
                catalogopeliculas.buscarPelicula(nombreArchivo, nombrePelicula);
                
            } else if(opcion == 0){
                bucle = true;
                catalogopeliculas.eliminarArchivo(nombreArchivo);
            }
        }
    }
}
