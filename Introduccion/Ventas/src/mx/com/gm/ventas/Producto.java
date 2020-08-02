package mx.com.gm.ventas;

public class Producto {

    private final int idProyecto; //Su vabcor no se podrá modificar
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        this.idProyecto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProyecto=").append(idProyecto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
    

}
