package mpoop5;


import mpoop5.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joser
 */
public class Coche {
 String modelo;
    String color;
    float kilometraje;
    int asientos;
    int puertas;
    Persona chofer;
    Persona copiloto;
    Persona pasajero1;

    public Coche(){
        modelo = null;
        color = null;
        kilometraje = 0;
        asientos = 0;
        puertas = 0;
        chofer = null;
        copiloto = null;
        pasajero1 = null;
    }

    public Coche(String modelo, String color, float kilometraje, int asientos, int puertas, Persona chofer, Persona copiloto, Persona pasajero1){
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.asientos = asientos;
        this.puertas = puertas;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        
    }
    public void imprimirCoche(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Asientos: " + asientos);
        System.out.println("Puertas: " + puertas);
        System.out.println("Chofer: ");
        chofer.imprimirPersona();
        System.out.println("Copiloto: ");
        copiloto.imprimirPersona();
        System.out.println("Pasajero 1: ");
        pasajero1.imprimirPersona();
    }
}
