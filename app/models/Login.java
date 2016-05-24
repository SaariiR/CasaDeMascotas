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
public class Login extends Model {
    
    public String usuario;
    public String clave;
    
    
    public Login(String usuario, String clave){
       
        this.usuario = usuario;
        this.clave = clave;
    }
    
}
