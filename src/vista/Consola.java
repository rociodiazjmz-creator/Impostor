package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Jugador;

/**
 * Clase que maneja las interacciones con el usuario de la aplicación.
 * 
 * @author Lázaro
 */
public class Consola {
    private Scanner teclado  = new Scanner(System.in);
    
    /**
     * Pedir una cadena de caracteres al usuario.
     * @param mensaje String que se mostrará al usuario antes de que introduzca la cadena.
     * @return cadena introducida por el usuario.
     */
    public String pideString(String mensaje){
        System.out.print(mensaje + ": ");
        return teclado.nextLine();
    }
    
    /**
     * Método que pide un número entero al usuario.
     * 
     * Realizamos una limpieza de buffer ya que utilizamos el método siempre después de pideString.
     * 
     * @param mensaje String que se mostrará al usuario antes de que introduzca el número.
     * @return número entero introducido por el usuario.
     */
    public int pideInt(String mensaje) {
        System.out.print(mensaje);
        int n = teclado.nextInt();
        teclado.nextLine(); 
        return n;
    }
    
    /**
     * Método para mostrar por consola.
     * @param mensaje String que se mostrará al usuario por pantalla.
     */

    public void mostrar(String mensaje){
        System.out.println(mensaje);
    }
    
    /**
     * Método para mostrar los resultados de la partida.
     * 
     * Muestra por pantalla los roles de los usuarios, indicaciones, y la palabra del juego.
     * 
     * @param lista ArrayList compuesto por los jugadores de cada partida.
     * @param palabra Palabra secreta de cada ronda.
     */
    public void mostrarResultados(ArrayList<Jugador> lista, String palabra) {
        System.out.printf("\n\t %c ROLES ASIGNADOS %c\n", 126, 126);
        for (Jugador j : lista){
            if(j.getRol().equals("ARBITRO")){
                mostrar(j.getNombre() + " - ARBITRO");
                mostrar("Pulsa intro, si eres el árbitro, para empezar a jugar...");
                teclado.nextLine();
            }
            else if (j.getRol().equals("IMPOSTOR")){
                mostrar(j.getNombre() + " - IMPOSTOR");
            } 
        }
        mostrar("\nPALABRA: " + palabra);
        mostrar("");
    }
}