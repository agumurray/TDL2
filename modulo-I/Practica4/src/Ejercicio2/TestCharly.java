package Ejercicio2;

public class TestCharly {
    public static void main(String[] args) {
        CharlyGarcia charly = CharlyGarcia.getInstance();
        charly.cantar();
        CharlyGarcia charly2 = CharlyGarcia.getInstance();
        charly2.cantar();
    }
}
