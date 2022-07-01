package Ejercicio17;

public class Electrodomesticos {


    //precio base, color, consumo energético (A-F) y peso.
    // Indican que se podrán heredar.
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public static final double precioBaseDEF = 100;
    public static final String colorDEF= "blanco";
    public static final char consumoEnergeticoDEF = 'F';
    public static final double pesoDEF=5;

    protected String coloresDisponibles []={"blanco", "negro", "rojo", "azul", "gris"};

//constructor defecto
    public Electrodomesticos(){
        this.precioBase = precioBaseDEF;
        this.color = colorDEF;
        this.consumoEnergetico = consumoEnergeticoDEF;
        this.peso = pesoDEF;
    }

    //constructor precio y peso

    public Electrodomesticos (double precioBase, double peso){
        this.precioBase=precioBase;
        this.peso=peso;
    }

    //todos los atributos

    public Electrodomesticos(double precioBase, double peso, String color, char consumoEnergetico){
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=color;
        this.consumoEnergetico=consumoEnergetico;
    }
}
