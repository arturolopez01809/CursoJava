package Herencia;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Static para contar el número de objetos Empleado que se crean
    
    
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    
    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this(); //Llamamos al primer constructor
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(int idEmpleado, double sueldo, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }


    //GETS

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    //SETS
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    

}
