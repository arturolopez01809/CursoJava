package com.gm.mundopc;


public class Teclado extends DispositivosEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public int getContadorTeclados() {
        return contadorTeclados;
    }

    public void setContadorTeclados(int contadorTeclados) {
        this.contadorTeclados = contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(", contadorTeclados=").append(contadorTeclados);
        sb.append('}');
        return sb.toString();
    }
    
    
}
