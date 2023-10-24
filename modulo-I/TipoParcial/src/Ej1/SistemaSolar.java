package Ej1;

public class SistemaSolar {
    private static SistemaSolar INSTANCE = new SistemaSolar();
    private Planeta[] planetas = {
        new Planeta(0, Tipo.ROCOSO, "Mercurio", 4879, 57910000),
        new Planeta(0, Tipo.ROCOSO, "Venus", 12104, 108200000),
        new Planeta(1, Tipo.ROCOSO, "Tierra", 12756, 149600000),
        new Planeta(2, Tipo.ROCOSO, "Marte", 6792, 227940000),
        new Planeta(79, Tipo.GASEOSO, "Jupiter", 142984, 778330000),
        new Planeta(82, Tipo.GASEOSO, "Saturno", 120536, 1429400000),
        new Planeta(27, Tipo.GASEOSO, "Urano", 51118, 2870990000L),
        new Planeta(14, Tipo.GASEOSO, "Neptuno", 49528, 4504300000L)
    };
    private SistemaSolar(){}

    public static SistemaSolar getInstance(){
        return INSTANCE;
    }

    public Planeta[] getPlanetas(){
        return planetas;
    }
}
