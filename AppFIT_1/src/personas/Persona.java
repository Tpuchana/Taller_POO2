/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author tepuc
 */
public class Persona {
    
    private final String nombre;
    private int edad;
    private final double estatura;
    private double peso;

    public Persona(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }
    
    public void bajarPeso(){
        this.peso--;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + '}';
    }
    
    
    
    
    
    
}



