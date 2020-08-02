package excepciones;

//Podemos usar RuntimeException para que nuestro código sea lo más limpio posible en la clase testExcepciones y así no usaremos el try catch
public class OperacionExcepcion extends Exception {

    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
}
