package Ej1;

public class Test {
    public static void main(String[] args) {
        //creo sistemasolar
        SistemaSolar sistemasolar = SistemaSolar.getInstance();
        //pruebo telescopio
        Planeta[] planetas = sistemasolar.getPlanetas();
        for (Planeta planeta : planetas) {
            System.out.println(Telescopio.distanciaSol(planeta));
            Telescopio.tipo(planeta);
        }
    }
}
