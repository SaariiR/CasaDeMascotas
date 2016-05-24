
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
public class MascotaPerros extends Model {
      public String nombre;
    public String desde;
    public String sexo;
    public String fechaDeNacimiento;
    public String raza;
    public String tamaño;
    public String localidad;
    public String situacion;
    public String salud;
    public boolean urgente;
    public String descripcion;
    public String imagen;

    public MascotaPerros(String nombre, String desde, String sexo,
            String fechaDeNacimiento, String raza, String tamaño, String localidad,
            String situacion, String salud, boolean urgente, String descripcion,
            String imagen) {

        
        this.nombre = nombre;
        this.desde = desde;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.raza = raza;
        this.tamaño = tamaño;
        this.localidad = localidad;
        this.situacion = situacion;
        this.salud = salud;
        this.urgente = urgente;
        this.descripcion = descripcion;
        this.imagen = imagen;

    }

}
