package test;

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 7, 5, 8);
    }
    
    private static void imprimirNumeros(int... numeros){ //Es un vector internamente
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
