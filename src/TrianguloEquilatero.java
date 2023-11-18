import java.util.Scanner;

public class TrianguloEquilatero {

public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa la longitud del lado A del triangulo: ");
    double ladoA = scanner.nextDouble();
    System.out.println("Ingresa la longitud del lado B del triangulo: ");
    double ladoB = scanner.nextDouble();
    System.out.println("Ingresa la longitud del lado C del triangulo: ");
    double ladoC = scanner.nextDouble();

//Es trinagulo equilátero cuando todos sus lados tienen la misma longitud
    if (ladoA == ladoB && ladoB == ladoC) {
        System.out.println("El triangulo es equilátero");
    } else {
        System.out.println("El triangulo no es equilátero");
    }

    scanner.close();

}

}