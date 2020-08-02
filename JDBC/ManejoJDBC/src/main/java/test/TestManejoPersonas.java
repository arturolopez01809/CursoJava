package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
        
//        PersonaDAO personaDao = new PersonaDAO();
//        
//        //Insertando un nuevo objeto de tipo Persona
//        //Persona personaNueva = new Persona("Pablo", "Mena", "pablomena@gmail.com", "98571255");
//        
//        //personaDao.insertar(personaNueva);
//        
//        //MODIFICAR UNA PERSONA
////        Persona personaModificar = new Persona(4, "Pepe", "Lopez", "pepelopez@gmail.com", "633859005");
////        
////        personaDao.actualizar(personaModificar);
//        
//        //ELIMINAR UN REGISTRO
//        Persona personaEliminar = new Persona(4);
//        
//        personaDao.eliminar(personaEliminar);
//        
//        List<Persona> personas = personaDao.seleccionar();
//        
//        for(Persona persona: personas){
//            System.out.println("persona = " + persona);
//        }
        
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            //Necesitamos que el commit no sea de forma automatica
            //No queremos que cada vez que se realice una sentencia se guarde directamente
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            PersonaDAO personadao = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona(1, "Pedro", "Manchego", "padromanchego.yahoo.es", "987554226");
            personadao.actualizar(cambioPersona);
            
            conexion.commit(); //Hacemos que la ejecución se guarde en la base de datos
            
            List<Persona> personas = personadao.seleccionar();
        
           for(Persona persona: personas){
                System.out.println("persona = " + persona);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
         
        
    }
}
