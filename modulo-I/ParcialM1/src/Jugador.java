public class Jugador {
    private String nombre;
    private Eleccion eleccion;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPunto() {
        this.puntos++;
    }
}
