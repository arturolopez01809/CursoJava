package com.gm.mundopc;


public class Raton extends DispositivosEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public int getContadorRatones() {
        return contadorRatones;
    }

    public void setContadorRatones(int ContadorRatones) {
        this.contadorRatones = contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append(", ContadorRatones=").append(contadorRatones);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
