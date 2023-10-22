public class IMC {
    private double peso;
    private double altura;

    public IMC(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }

    public IMC() {

    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculo() {
        return this.peso/Math.pow(this.altura, 2);
    }
}
