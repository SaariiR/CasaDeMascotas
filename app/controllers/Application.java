package controllers;

import models.AltaSocio;
import play.data.validation.*;
import play.mvc.*;


/**
 *
 * @author Rebeca Sarahi Guzman Robles 244645
 * @author Sara Rodriguez Soto 262002
 *
 */

public class Application extends Controller {

    public static void index() {
        render();
    }
   
    public static void apadrina(){
     render();
    }
  
    public static void contactar(){
     render();
    }
  
    public static void hazteSocio(String nombre, String apellidos, String fechaDeNacimiento,
            String usuario, String clave,
            String email, int telefono, String titular, int cuenta, String periocidad,
            int cantidad, String comentarios){
            
        AltaSocio socio = new AltaSocio(nombre, apellidos, fechaDeNacimiento, usuario, clave,
            email,  telefono,  titular,  cuenta, periocidad,  cantidad, comentarios);
        socio.save();
       
        render();
    }
  
    public static void loginMas(){
     render();
    }
  
    public static void ver(){
     render();
    }
  
    public static void verMas(){
     render();
    }
  


    
    
}