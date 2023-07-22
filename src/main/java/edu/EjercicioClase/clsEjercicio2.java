package edu.ejemplo;

import java.util.Scanner;

public class clsEjercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double circunferencia = circunferenciaCirculo(radio);
        System.out.println("La circunferencia del círculo es: " + circunferencia);

        scanner.close();
    }

    public static double circunferenciaCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}

