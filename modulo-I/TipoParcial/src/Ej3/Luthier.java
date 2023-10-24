package Ej3;
import java.util.Random;

public class Luthier {
    public static void afinar(Instrumento instrumento) {
        if (instrumento instanceof Cuerda) {
            instrumento.setAfinacion(TipoAfinacion.DO);
            return;
        }
        if (instrumento instanceof Viento) {
            // setear afinacion en SI o LA
            int random = new Random().nextInt(2);
            if (random == 0) {
                instrumento.setAfinacion(TipoAfinacion.SI);
            } else {
                instrumento.setAfinacion(TipoAfinacion.LA);
            }
            return;
        }
        if (instrumento instanceof Percusion) {
            instrumento.setAfinacion(TipoAfinacion.RE);
            return;
        }
    }
}
