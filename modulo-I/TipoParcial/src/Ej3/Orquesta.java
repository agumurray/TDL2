package Ej3;

public class Orquesta {
    public static void main(String[] args){
        Instrumento[] orquesta = new Instrumento[7];
        orquesta[0] = new Cuerda();
        orquesta[1] = new Cuerda();
        orquesta[2] = new Viento();
        orquesta[3] = new Viento();
        orquesta[4] = new Viento();
        orquesta[5] = new Percusion();
        orquesta[6] = new Percusion();

        for (Instrumento instrumento : orquesta) {
            instrumento.tocar();
        }

        for (Instrumento instrumento : orquesta) {
            Luthier.afinar(instrumento);
        }

        for (Instrumento instrumento : orquesta) {
            instrumento.tocar();
        }
    }
}
