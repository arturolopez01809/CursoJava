package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor("HP", 13);
        
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        
        Raton ratonHP = new Raton("bluetooth", "HP");
        
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Orden orden1 = new Orden();
        
        orden1.agragarComputadora(computadoraHP);
        
        orden1.mostrarOrden();
    }
}
