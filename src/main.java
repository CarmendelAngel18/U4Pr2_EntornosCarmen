import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Punto punto1 = new Punto(1, 2, 1234);
        Punto punto2 = new Punto(3, 4, 2345);
        Punto punto3 = new Punto(5, 6, 6789);

        Linea linea1 = new Linea(punto1, punto2, 7654);

        Area area1 = new Area(punto1, punto2, punto3, 9876);

        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto3);
        System.out.println(linea1);
        System.out.println(area1);
    }
}
