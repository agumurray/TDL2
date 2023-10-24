package Ej1;

public class Telescopio {
    public static String distanciaSol(Planeta planeta){
        return "La distancia de " + planeta.getNombre() + " es "  + planeta.getDistanciaSol();
    }

    public static void tipo(Planeta planeta){
        switch(planeta.getTipo()){
            case ROCOSO:
                System.out.println("El planeta " + planeta.getNombre() + " es rocoso");
                break;
            case GASEOSO:
                System.out.println("El planeta " + planeta.getNombre() + " es gaseoso");
                break;
        }
    }
}
