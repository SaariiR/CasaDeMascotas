package controllers;

import flexjson.JSONSerializer;
import java.util.List;
import models.AltaSocio;
import models.*;
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

    public static void apadrina(String nombreM, String nombre, String apellidos,
            String fechaDeNacimiento, String email, int telefono, String titular, 
            int cuenta, String periocidad, int cantidad, String comentarios) {

        Apadrina padrino = new Apadrina(nombreM, nombre, apellidos, fechaDeNacimiento, 
                email, telefono,titular, cuenta, periocidad, cantidad, comentarios);
        padrino.save();

        render();
    }

    public static void contactar(String nombreApe, String email,int telefono,
            String localidad , String asunto , String mensaje ) {
        
        Contactar contacto = new Contactar (nombreApe, email,telefono,
            localidad , asunto, mensaje);
        contacto.save();
        
        render();
    }

    public static void hazteSocio(String nombre, String apellidos, String fechaDeNacimiento,
            String usuario, String clave, String email, int telefono, String titular,
            int cuenta, String periocidad, int cantidad, String comentarios) {

        AltaSocio socio = new AltaSocio(nombre, apellidos, fechaDeNacimiento, usuario, clave,
                email, telefono, titular, cuenta, periocidad, cantidad, comentarios);
        socio.save();

        render();
    }

    public static void loginMas() {
        render();
    }

    public static void ver() {
        render();
    }

    public static void verMas() {
        render();
    }

    public static void getGatos() {

        List<MascotaGatos> lista = MascotaGatos.findAll();

        renderJSON(
                new JSONSerializer()
                .include("id", "nombre", "descripcion", "localidad", "imagen")
                .exclude("*")
                .serialize(lista)
        );

    }

    

}
