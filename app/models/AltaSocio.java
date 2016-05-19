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
public class AltaSocio extends Model{

// DATOS DE CONTACTO
    public String nombre;
    public String apellidos;
    public String fechaDeNacimiento;
    public String email;
    public int telefono;
//DATOS BANCARIOS
    public String titular;
    public int cuenta;
// PERIOCIDAD ya sea mensual , semestral , trimestral o anual
public String periocidad;
// APORTACION
    public int cantidad;
// COMENTARIOS
    public String comentarios;

    public AltaSocio(String nombre, String apellidos, String fechaDeNacimiento,
            String email, int telefono, String titular, int cuenta,
            int cantidad, String comentarios) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.titular = titular ;
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


