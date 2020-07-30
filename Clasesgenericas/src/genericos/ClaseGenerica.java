package genericos;

//Indicamos un tipo genérico de la clase
public class ClaseGenerica<T> {
    
    T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
