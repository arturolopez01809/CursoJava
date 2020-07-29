package com.gm.mundopc;


public class Orden {
    private int idOrden;
    private Computadora computadora[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agragarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Primo mirate el tamaño del vector");
        }
    }
    
    public void mostrarOrden(){
        
        System.out.println("Orden #:" + this.idOrden);
        
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadora[i]);
        }
    }
}
