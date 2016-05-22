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
    public String nombre;
    @Required 
    public String apellidos;
    @Required
    public String fechaDeNacimiento;
    @Required
    public String usuario;
    @Required
    public String clave;
    @Required
    @Email
    public String email;
    @Required
    @Phone 
    public int telefono;
//DATOS BANCARIOS
    @Required
    public String titular;
    @Required
    public int cuenta;
// PERIOCIDAD ya sea mensual , semestral , trimestral o anual
    @Required
    public String periocidad;
// APORTACION
    @Required
    public int cantidad;
// COMENTARIOS
    @Required
    @MaxSize(500)
    public String comentarios;

    public AltaSocio(String nombre, String apellidos, String fechaDeNacimiento,
            String usuario, String clave,
            String email, int telefono, String titular, int cuenta, String periocidad,
            int cantidad, String comentarios) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.usuario = usuario;
        this.clave = clave;
        this.email = email;
        this.telefono = telefono;
        this.titular = titular ;
        this.periocidad = periocidad;
        this.cuenta= cuenta;
        this.comentarios = comentarios;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    @Override
     public String toString() {
     return nombre;
     }
}


