package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Jugador;

/**
 *
 * @author claudiaescuderomontoro
 */
public class Consola {
    private Scanner teclado  = new Scanner(System.in);
    
    public String pideString(String mensaje){
        System.out.print(mensaje + ": ");
        return teclado.nextLine();
    }
    
    public int pideInt(String msg) {
        System.out.print(msg);
        int n = teclado.nextInt();
        teclado.nextLine(); // buffer
        return n;
    }

    public void mostrar(String mensaje){
        System.out.println(mensaje);
    }

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