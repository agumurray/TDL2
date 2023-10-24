package Ej2;

public class Equipo {
    //5 o más jugadores, 5 es el mínimo pero pueden tener suplentes. Cada uno de los jugadores puede jugar en solo dos de las siguientes posiciones de Arquero, Delantero, Defensa o Mediocampo.
    private Jugador[] jugadores;
    private int cantidad;

    public Equipo(Jugador[] jugadores) {
        this.jugadores = jugadores;
        this.cantidad = jugadores.length;
    }


    public boolean validarEquipo(){
        if (cantidad < 5) return false;
        int[] cantPos = new int[4];
        for (Jugador jugador: jugadores) {
            Posicion[] posiciones = jugador.getPos();
            for (Posicion pos: posiciones) {
                cantPos[pos.ordinal()]++;
            }
        }
        if (cantPos[1]<2) return false;
        for (int i = 0; i < 4; i++) {
            if (cantPos[i]<1) return false;
        }
        return true;
    }


}
