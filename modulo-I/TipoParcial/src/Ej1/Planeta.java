package Ej1;

public class Planeta {
    private int cantLunas;
    private Tipo tipo;
    private String nombre;
    private double diametro;
    private double distanciaSol;

    public Planeta(int cantLunas, Tipo tipo, String nombre, double diametro, double distanciaSol) {
        this.cantLunas = cantLunas;
        this.tipo = tipo;
        this.nombre = nombre;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
    }

    public Planeta(){}

    //getters y setters
    public int getCantLunas() {
        return cantLunas;
    }

    public void setCantLunas(int cantLunas) {
        this.cantLunas = cantLunas;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre= nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "cantLunas=" + cantLunas +
                ", tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                '}';
    }


}
