package Ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);

        System.out.println("Introducir nombre: ");
        String nombre= captura.nextLine();
        System.out.println("Introducir edad: ");
        int edad = captura.nextInt();
        System.out.println("Introducir sexo");
        char sexo = captura.next().charAt(0);
        System.out.println("introducir peso: ");
        double peso = captura.nextDouble();
        System.out.println("Introducir altura");
        int altura =captura.nextInt();

        Persona persona = new Persona();



    }
}
