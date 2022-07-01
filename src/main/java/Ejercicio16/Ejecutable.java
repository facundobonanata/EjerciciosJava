package Ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        System.out.println("Introducir nombre: ");
        String nombre = captura.nextLine();
        System.out.println("Introducir edad: ");
        int edad = captura.nextInt();
        System.out.println("Introducir dni: ");
        String DNI = captura.nextLine();
        System.out.println("Introducir sexo");
        char sexo = captura.next().charAt(0);
        System.out.println("introducir peso: ");
        double peso = captura.nextDouble();
        System.out.println("Introducir altura");
        int altura = captura.nextInt();


        //3 obj Persona
        Persona persona1 = new Persona(nombre, edad, DNI, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona = new Persona(); //establecer  (set)//


        //persona//
        persona.setNombre("Fernando");
        persona.setEdad(27);
        persona.setSexo('H');
        persona.setPeso(80);
        persona.setAltura(182);

        //p1//
        persona2.setAltura(175);
        persona2.setPeso(70);

        System.out.println("Persona 2");
        mayorDeEdad(persona2);
        mostrarPeso(persona2);
        System.out.println(persona2.toString());

        /*System.out.println("Persona");
        mayorDeEdad(persona);
        mostrarPeso(persona);
        System.out.println(persona.toString());*/

        /*System.out.println("Persona1");
        mayorDeEdad(persona1);
        mostrarPeso(persona1);
        System.out.println(persona1.toString());*/


//p metodos//
    }
    public static void mayorDeEdad(Persona persona) {
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    //mostrar el peso//
    public static void mostrarPeso(Persona persona){
        double IMC   = persona.calcularIMC();
        if (IMC == -1) {
            System.out.println("Esta delgado");
        } else if (IMC == 0) {
            System.out.println("Esta en su peso ideal");
        } else if (IMC == 1) {
            System.out.println("Tiene sobrepeso");
        }
    }
}



