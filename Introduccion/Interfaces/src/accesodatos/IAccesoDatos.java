package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    
    void insertar(); //Los metodos van a ser public abstract
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
    
}
