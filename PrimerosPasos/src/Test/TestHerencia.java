/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Herencia.Cliente;
import Herencia.Empleado;
import java.util.Date;

/**
 *
 * @author artur
 */
public class TestHerencia {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Arturo", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        
//        Cliente cliente1 = new Cliente(new Date(), true, "Arturo", 'M', 19, "Calle Brasil 37");
//        System.out.println("cliente1 = " + cliente1);
        
    }
}
