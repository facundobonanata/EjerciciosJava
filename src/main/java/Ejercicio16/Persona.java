package Ejercicio16;

public class Persona {   //clase persona//
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private int altura;

    //usar constante(final)//
    public final static char SEXODF='H';
    public final static int DELGADO =-1;
    public final static int IDEAL=0;
    public final static int SOBREPESO=1;

    //3 const: defecto, nombre, edad y sexo, todos los para//

    //defecto//
    public Persona(){
        this.nombre="";
        this.edad=0;
        this.sexo= 'H';
        this.DNI="";
        this.altura= 0;
        this.peso = 0;
    }

    //3 param//
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo=sexo;
        this.DNI="";
        this.altura=0;
        this.peso=0;


    }
    //todos los param
    public Persona(String nombre, int edad, String dni, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }
    public void setNombre(String nombre){ //setear vlares
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setDNI(String DNI){  //quitar dni//
        this.DNI=DNI;
    }
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public void setAltura(int altura){
        this.altura=altura;
    }

    //IMC -> (peso en kg/(altura^2  en m))//usar final para el retrn
    //Math.pow
    // <20 ->-1
    // 20/25 ->0 peso por debajo ideal
    // >25 -> 1 sobrepeso

    public int calcularIMC(){
        double Imc = (this.peso/(Math.pow(this.altura, 2)));
        if (Imc < 20){
            return IDEAL;
        }else if(Imc >=20 && Imc <= 25){
            return DELGADO;
        }else{
            return SOBREPESO;
        }
    }

    //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }else{
            return false;
        }

    }

    //Determinar si sexo es corrcto, H defecto//

    public char determinarSexo(char sexo){
        if(this.sexo != 'W' && this.sexo !='H'){
            this.sexo=SEXODF;
        }
        return SEXODF;

    }

    @Override
    public String toString(){
        return "Informacion \n" +
                "Nombre: " + nombre + "\n" +
                 "Sexo: " + sexo + "\n" +
                 "Edad: " + edad + " años\n" +
                "DNI" + DNI + "\n" +
                 "Altura: " + altura + " metros\n" +
                "peso: " + peso+ " kg\n";
    }

    //DNI 8 cifras aleatorias
}

