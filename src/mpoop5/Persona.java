package mpoop5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author joser
 */
public class Persona {
    private int edad;
    private float altura;
    private String nombre;
    private Fecha fechaDeNacimiento;
    private String ocupacion;
    public Persona(){
    }
    public Persona(int edad, float altura, String nombre, Fecha fechaDeNacimiento,String ocupacion){
        this.edad=edad;
        this.altura=altura;
        this.nombre=nombre;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.ocupacion=ocupacion;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Fecha getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento){
        this.fechaDeNacimiento=fechaDeNacimiento;
    }
    public String getOcupacion(){
        return ocupacion;
    }
    public void setOcupacion(String ocupacion){
        this.ocupacion=ocupacion;
    }
    
    public boolean comer(){
        return true;
    }
    public boolean jugar(){
        return false;
    }
    public int correr(){
        return 5;
    }
    public void saludar(){
        System.out.println("Hola");
    }
    public void estudiar(){
        System.out.println("La persona está estudiando");
    }
    public void imprimirPersona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Altura:"+altura);
        System.out.println("Ocupacion: "+ocupacion);
        System.out.println("Fecha de Nacimiento: "+fechaDeNacimiento.imprimirFecha());
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", ocupacion=" + ocupacion + '}';
    }
    
}
