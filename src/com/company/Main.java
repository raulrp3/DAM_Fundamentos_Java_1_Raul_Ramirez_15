package com.company;

import java.util.Scanner;

public class Main {
    public static int validarEntero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.println("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
    }

    public static boolean validarFecha(int dia, int mes, int año) {
        boolean validado = true;
        if ((dia > 30 || dia < 1) || (mes > 12 || mes < 1) || año < 0) {
            validado = false;
        }
        return validado;
    }

    public static void main(String[] args) {
        int dia, mes, año;
        boolean esCorrecta;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a comprobar si una fecha es correcta! ");
        System.out.print("Introduce un día: ");
        dia = validarEntero(sc);
        System.out.print("Introduce un mes: ");
        mes = validarEntero(sc);
        System.out.print("Introduce un año: ");
        año = validarEntero(sc);
        sc.close();
        esCorrecta = validarFecha(dia, mes, año);
        if (esCorrecta) {
            System.out.printf("La fecha %d/%d/%d es: CORRECTA\n", dia, mes, año);
        } else {
            System.out.printf("La fecha %d/%d/%d es: INCORRECTA\n", dia, mes, año);
        }
    }
}
