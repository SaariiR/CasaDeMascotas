package models;


import javax.persistence.Entity;

import play.db.jpa.Model;
/**
 *
 * @Rebeca Sarahi Guzman Robles 244645
 * @author Sara Rodriguez Soto 262002
 *
 */
@Entity
public class Contactar extends Model {

    public String nombreApe;
    public String email;
    public int telefono;
    public String localidad;

// MENSAJE
    public String asunto;
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
