
package modelo;

/**
 * Clase que representa a un jugador dentro del juego.
 * 
 * Contiene atributos como el nombre y el rol (por defecto será CIVIL) del jugador, 
 * los métodos constructores, los Getter y los Setter.
 * 
 * @author Carol
 */
public class Jugador {
    private String nombre;
    private String rol; 
   
    public Jugador(){
        nombre = null;
        rol = "CIVIL";
    }
    public Jugador(String nombre){
        this.nombre = nombre;
        this.rol = "CIVIL";   
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    } 
}
