package Ejercicio2;

public class CharlyGarcia {
        private static CharlyGarcia instance;
        private CharlyGarcia(){
        }
        public static CharlyGarcia getInstance(){
            if(CharlyGarcia.instance == null){
                CharlyGarcia.instance = new CharlyGarcia();
            }
            return instance;
        }

        public void cantar(){
            System.out.println("Soy Charly Garcia y estoy cantando");

        }

        public void afinar()
}
