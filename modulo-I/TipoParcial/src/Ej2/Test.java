package Ej2;

public class Test {
    public static void main(String[] args){
        Equipo equipo = new Equipo(new Jugador[]{
                new Jugador(new Posicion[]{Posicion.PORTERO, Posicion.DEFENSA}),
                new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.CENTROCAMPISTA}),
                new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.CENTROCAMPISTA}),
                new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.CENTROCAMPISTA}),
                new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.CENTROCAMPISTA}),
                new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.CENTROCAMPISTA}),});

        Equipo equipo2 = new Equipo(new Jugador[]{
                new Jugador(new Posicion[]{Posicion.PORTERO, Posicion.DEFENSA}),
                new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.CENTROCAMPISTA}),
                new Jugador(new Posicion[]{Posicion.DEFENSA, Posicion.CENTROCAMPISTA}),
                new Jugador(new Posicion[]{Posicion.DELANTERO, Posicion.CENTROCAMPISTA}),
                new Jugador(new Posicion[]{Posicion.DELANTERO, Posicion.CENTROCAMPISTA}),});
        System.out.println(equipo.validarEquipo());
        System.out.println(equipo2.validarEquipo());
    }
}