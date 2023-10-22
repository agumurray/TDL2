import java.util.Scanner;
public class TestIMC {
    public static void main(String[] args) {
        IMC imc = new IMC();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese su peso: ");
        double peso = scanner.nextDouble();
        imc.setAltura(altura);
        imc.setPeso(peso);
        double valorIMC = imc.calculo();
        if ((valorIMC >= 18) && (valorIMC <= 25)) {
            System.out.println("Saludable");
        }
        else
            System.out.println("NO saludable");
    }
}