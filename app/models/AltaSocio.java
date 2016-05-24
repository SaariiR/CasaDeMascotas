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
public class AltaSocio extends Model{

// DATOS DE CONTACTO
    @Required 
    public String nombre = null;
    @Required 
    public String apellidos = null;
    @Required
    public String fechaDeNacimiento = null;
    @Required
    public String usuario = null;
    @Required
    public String clave = null;
    @Required
    @Email
    public String email = null;
    @Required
    @Phone 
    public int telefono = 0;
//DATOS BANCARIOS
    @Required
    public String titular =  null;
    @Required
    public int cuenta = 0;
// PERIOCIDAD ya sea mensual , semestral , trimestral o anual
    @Required
    public String periocidad = null;
// APORTACION
    @Required
    public int cantidad = 0 ;
// COMENTARIOS
    @Required
    @MaxSize(500)
    public String comentarios = null;

    public AltaSocio(String nombre, String apellidos, String fechaDeNacimiento,
            String usuario, String clave, String email, int telefono, String titular, 
            int cuenta, String periocidad, int cantidad, String comentarios) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.usuario = usuario;
        this.clave = clave;
        this.email = email;
        this.telefono = telefono;
        this.titular = titular;
        this.periocidad = periocidad;
        this.cantidad = cantidad;
        this.cuenta= cuenta;
        this.comentarios = comentarios;
    }
}


