package comparacionstring;
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = "Hola";
        String str3 = "Adios";
        String str4 = "Hola";
        String str5 = new String("Hola");
        String str6 = new String("Hola");
        String str7 = new String("Adios");
        System.out.println("str1 == str2 es " + (str1 == str2));
        System.out.println("str1 == str3 es " + (str1 == str3));
        System.out.println("str1 == str4 es " + (str1 == str4));
        System.out.println("str1 == str5 es " + (str1 == str5));
        System.out.println("str5 == str6 es " + (str5 == str6));
        System.out.println("str5 == str7 es " + (str5 == str7));
        System.out.println("str1.equals(str2) es " + str1.equals(str2));
        System.out.println("str1.equals(str3) es " + str1.equals(str3));
        System.out.println("str1.equals(str4) es " + str1.equals(str4));
        System.out.println("str1.equals(str5) es " + str1.equals(str5));
        System.out.println("str5.equals(str6) es " + str5.equals(str6));
        System.out.println("str5.equals(str7) es " + str5.equals(str7));
    }
}