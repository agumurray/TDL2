public class Ronda {
    private Jugador jugador;
    private Jugador computadora;

    public Ronda(Jugador jugador, Jugador computadora) {
        this.jugador = jugador;
        this.computadora = computadora;
    }

    public void jugar() {
        Eleccion eleccionJugador = jugador.getEleccion();
        Eleccion eleccionComputadora = computadora.getEleccion();

        System.out.println(jugador.getNombre() + " eligió " + eleccionJugador);
        System.out.println(computadora.getNombre() + " eligió " + eleccionComputadora);

        if (eleccionJugador == eleccionComputadora) {
            System.out.println("Empate!");
        } else if (eleccionJugador == Eleccion.PIEDRA && eleccionComputadora == Eleccion.TIJERA) {
            System.out.println(jugador.getNombre() + " gana!");
            jugador.sumarPunto();
        } else if (eleccionJugador == Eleccion.PAPEL && eleccionComputadora == Eleccion.PIEDRA) {
            System.out.println(jugador.getNombre() + " gana!");
            jugador.sumarPunto();
        } else if (eleccionJugador == Eleccion.TIJERA && eleccionComputadora == Eleccion.PAPEL) {
            System.out.println(jugador.getNombre() + " gana!");
            jugador.sumarPunto();
        } else {
            System.out.println(computadora.getNombre() + " gana!");
            computadora.sumarPunto();
        }
    }
}
