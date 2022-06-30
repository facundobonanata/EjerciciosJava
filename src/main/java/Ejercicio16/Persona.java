package Ejercicio16;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private int altura;

    //3 const: defecto, nombre, edad y sexo, todos los para//

    //defecto//



    //3 param//
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo=sexo;
    }



    //todos los param
    public Persona(String nombre, int edad, int dni, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }
}
