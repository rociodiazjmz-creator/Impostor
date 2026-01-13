
package modelo;

/**
 *
 * @author carol
 */
public class Jugador {
     private String nombre;
    private String rol; //Impostor, Civil o Árbitro
   
    public Jugador(String nombre){
        this.nombre = nombre;
        this.rol = "CIVIL";
        /*
        El rol se asigna y va cambiado de estado.
        Por defecto se pondrá null, que sería igual que no    
        ponerlo en el constructor
        */  
       
    }
    // Getters y Setters
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
