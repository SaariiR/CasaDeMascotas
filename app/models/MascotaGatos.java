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
public class MascotaGatos extends Model {

    
    public String nombre;
    public String desde;
    public String sexo;
    public String fechaDeNacimiento;
    public String raza;
    public String tamanio;
    public String localidad;
    public String situacion;
    public String salud;
    public boolean urgente;
    public String descripcion;
    public String status;

    public MascotaGatos(String nombre, String desde, String sexo,
            String fechaDeNacimiento, String raza, String tamanio, String localidad,
            String situacion, String salud, boolean urgente, String descripcion,
            String status) {

        
        this.nombre = nombre;
        this.desde = desde;
        this.sexo = sexo;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.raza = raza;
        this.tamanio = tamanio;
        this.localidad = localidad;
        this.situacion = situacion;
        this.salud = salud;
        this.urgente = urgente;
        this.descripcion = descripcion;
        this.status = status;

    }

   /* public Mascota(String nombre, boolean urgente) {
        this(nombre, urgente, false);
    }*/
}
