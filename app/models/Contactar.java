package models;


import javax.persistence.*;
import play.data.validation.*;

import play.db.jpa.Model;
/**
 *
 * @author Rebeca Sarahi Guzman Robles 244645
 * @author Sara Rodriguez Soto 262002
 *
 */
@Entity
public class Contactar extends Model {
 
    @Required
    public String nombreApe;
    @Email
    @Required
    public String email;
    @Required
    public int telefono;
    @Required
    public String localidad;

// MENSAJE
    @Required
    public String asunto;
    @Required
    @MaxSize(500)
    public String mensaje;
    
    
    public Contactar(String nombreApe, String email,int telefono,
            String localidad , String asunto , String mensaje ){
        
        this.nombreApe = nombreApe;
        this.email = email;
        this.telefono = telefono;
        this.localidad = localidad;
        this.asunto = asunto;
        this.mensaje = mensaje;
    
    }

}
