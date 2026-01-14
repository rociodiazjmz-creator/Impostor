package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import modelo.Diccionario;
import modelo.Jugador;
import vista.Consola;

public class Partida {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Consola consola = new Consola();
    private Diccionario dict = new Diccionario();
    private Scanner teclado  = new Scanner(System.in);

    public void registrarJugadores() {
        int cantidad = consola.pideInt("¿Cuántos jugadores sois? Introduzca un número: ");
        //teclado.nextLine(); //---> AQUÍ NO FUNCIONA
        for (int i = 0; i < cantidad; i++) {
            String nombre = consola.pideString("Nombre del jugador " + (i + 1));
            jugadores.add(new Jugador(nombre));
        }
    }

    public void jugarRonda() { //en cada ronda, se mantienen los jugadores, pero no los roles
        String palabraSecreta = dict.obtenerPalabraAleatoria();      
        int nImpostores = consola.pideInt("¿Cuántos impostores habrá? Introduzca un número: ");
        Collections.shuffle(jugadores); //utilizamos este método para barajear

        //El primer jugador va a ser el árbitro
        jugadores.get(0).setRol("ARBITRO");

        //los siguientes N son los impostores
        for (int i = 1; i <= nImpostores; i++) {
            jugadores.get(i).setRol("IMPOSTOR");
        }
        consola.mostrarResultados(jugadores, palabraSecreta);
    }  
    
    
}