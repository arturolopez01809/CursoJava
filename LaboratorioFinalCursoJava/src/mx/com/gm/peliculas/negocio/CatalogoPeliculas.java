package mx.com.gm.peliculas.negocio;

public interface CatalogoPeliculas {
    
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarpelicula(String nombrepelicula, String nombreArchivo);
    
    void listarPeliculas(String nombreArchivo);
    
    void buscarPelicula(String nombreArchivo, String buscar);
    
    void iniciarArchivo(String nombreArchivo);
    
    void eliminarArchivo(String nombreArchivo);
}
