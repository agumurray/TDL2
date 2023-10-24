import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Juguemos a piedra, papel o tijera!");
        System.out.println("Usted va a jugar contra la computadora. Ingrese su nombre:");
        String nombre = scanner.nextLine();
        Jugador jugador = new Jugador(nombre);
        Jugador computadora = new Jugador("Computadora");

        System.out.println("Ingrese cuantas rondas desea jugar (una, tres o cinco): ");
        int cantRondas = 0;
        while (cantRondas != 1 && cantRondas != 3 && cantRondas != 5) {
            cantRondas = scanner.nextInt();
            if (cantRondas != 1 && cantRondas != 3 && cantRondas != 5) {
                System.out.println("Ingrese una cantidad válida de rondas (una, tres o cinco): ");
            }
        }

        for (int i = 0; i < cantRondas; i++) {
            System.out.println("Ingrese su elección (piedra, papel o tijera): ");
            String eleccion = scanner.next();
            while (!eleccion.equals("piedra") && !eleccion.equals("papel") && !eleccion.equals("tijera")) {
                System.out.println("Ingrese una elección válida (piedra, papel o tijera): ");
                eleccion = scanner.next();
            }
            if (eleccion.equals("piedra")) {
                jugador.setEleccion(Eleccion.PIEDRA);
            } else if (eleccion.equals("papel")) {
                jugador.setEleccion(Eleccion.PAPEL);
            } else {
                jugador.setEleccion(Eleccion.TIJERA);
            }

            int eleccionComputadora = (int) (Math.random() * 3);
            if (eleccionComputadora == 0) {
                computadora.setEleccion(Eleccion.PIEDRA);
            } else if (eleccionComputadora == 1) {
                computadora.setEleccion(Eleccion.PAPEL);
            } else {
                computadora.setEleccion(Eleccion.TIJERA);
            }

            Ronda ronda = new Ronda(jugador, computadora);
            ronda.jugar();
        }

        System.out.println("El resultado final es:");
        System.out.println(jugador.getNombre() + ": " + jugador.getPuntos() + " puntos");
        System.out.println(computadora.getNombre() + ": " + computadora.getPuntos() + " puntos");
        if (jugador.getPuntos() > computadora.getPuntos()) {
            System.out.println("Ganó " + jugador.getNombre() + "!");
        } else if (jugador.getPuntos() < computadora.getPuntos()) {
            System.out.println("Ganó " + computadora.getNombre() + "!");
        } else {
            System.out.println("Empate!");
        }

    }
}