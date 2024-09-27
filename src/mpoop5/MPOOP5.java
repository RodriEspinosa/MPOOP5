/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop5;

import mpoop5.Circulo;
import mpoop5.Circulo;
import mpoop5.Coche;
import mpoop5.Coche;
import mpoop5.Fecha;
import mpoop5.Fecha;
import mpoop5.Persona;
import mpoop5.Persona;

/**
 *
 * @author joser
 */
public class MPOOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Circulo circulo = new Circulo();
        circulo.getRadio();
        System.out.println(circulo.getRadio());
        circulo.setRadio(5f);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println("######### PERSONA ##########");
        Persona persona = new Persona();
        persona.setAltura(1.54f);
        persona.setEdad(19);
        persona.setNombre("Rodrigo");
        persona.setOcupacion("Estudiante");
        Fecha fecha = new Fecha();
        fecha.setDia(18);
        fecha.setMes(2);
        fecha.setAnio(2005);
        persona.setFechaDeNacimiento(fecha);
        persona.imprimirPersona();
        System.out.println(persona);
        System.out.println(fecha);  
        
        System.out.println("### COCHE CON PASAJEROS ###");
        Persona chofer = new Persona(19, 1.75f, "Emi", new Fecha(13, 8, 2005), "Chofer");
        Persona copiloto = new Persona(20, 1.54f, "Rodrigo", new Fecha(18, 2, 2005), "Copiloto");
        Persona pasajero1 = new Persona(40, 1.70f, "Ana", new Fecha(17, 10, 1983), "Pasajero 1");
        Coche miCoche = new Coche("BMW", "Rojo", 12000, 4, 2, chofer, copiloto, pasajero1);
        miCoche.imprimirCoche();
        System.out.println(chofer.getNombre() + " es el chofer.");
        System.out.println(copiloto.getNombre() + " es el copiloto.");
        System.out.println(pasajero1.getNombre() + " es el pasajero.");    
    }
    
}
