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
public class Apadrina extends Model {
    //APRINAR A : 

    @Required
    public String nombreM;

// DATOS DE CONTACTO 
    @Required
    public String nombre;
    @Required
    public String apellidos;
    @Required
    public String fechaDeNacimiento;
    @Email
    @Required
    public String email;
    @Required
    public int telefono;
//DATOS BANCARIOS
    public String titular;
    @Required
    public int cuenta;
// PERIOCIDAD
//public String Mensual ,trimestral , semestral , anual;
    @Required
    public String periocidad;
// APORTACION
    @Required
    public int cantidad;
// COMENTARIOS
    @Required
    @MaxSize(500)
    public String comentarios;

    public Apadrina(String nombreM, String nombre, String apellidos,
            String fechaDeNacimiento, String email, int telefono,
            String titular, int cuenta, String periocidad, int cantidad, String comentarios) {
        
        this.nombreM = nombreM;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
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

}
