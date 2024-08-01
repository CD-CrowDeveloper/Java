// javac nombre.java - copila el codigo
// java nombre - ejecuta el codigo

public class basics {
    public static void main(String[] args) {

        String mystring = "Esto es una cadena de teto";
        System.out.println(mystring);

        Integer myinteger = 7;
        System.out.println(myinteger);

        if (myinteger % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
