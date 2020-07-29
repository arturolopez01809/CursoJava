package com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double size;
    private static int contadorMonitor;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitor;
    }
    
    public Monitor(String marca, double size){
        this();
        this.marca = marca;
        this.size = size;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public static void setContadorMonitor(int aContadorMonitor) {
        contadorMonitor = aContadorMonitor;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
    
    
}
