package Clases;

public class Caja {
    int ancho;
    int alto;
    int profundo;
    //vol = ancho x alto x profundo
    
    public Caja(){
        this.ancho = 0;
        this.alto = 0;
        this.profundo = 0;
    }
    
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen(){
        int vol = 0;
        
        vol = this.ancho * this.alto * this.profundo;
        
        return vol;
    }
    
    
}
