package Clases;

public class PruebaCaja {
    
    public static void main(String[] args) {
        int vol = 0;
        
        Caja c = new Caja(3, 2, 6);
        
        vol = c.calcularVolumen();
        
        mostrarVolumen(vol);
    }
    
    public static void mostrarVolumen(int vol){
        System.out.println("Volumen: " + vol);
    }
}
