/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appfit_1;

import javax.swing.JOptionPane;
import personas.Persona;

/**
 *
 * @author tepuc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double estatura;
        double peso;
        int ejerciciosel;
        
        JOptionPane.showMessageDialog(null,"Bienvenido a la APP FIT");
        nombre = JOptionPane.showInputDialog("Introduzca su nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca su estatura"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Introduzca su peso"));
        
        Ejercitar appEjercitar = new Ejercitar(nombre, edad, estatura, peso);
        
        
        ejerciciosel = Integer.parseInt(JOptionPane.showInputDialog("Inserte su elección de ejercicio del día de hoy:\n"
                + "1. Correr\n"
                + "2. Caminar\n"
                + "3. Burpees\n"
                + "4. Saltar la cuerda\n"
                + "5. Bicicleta\n"
                + "6. Sentadillas"));
        if (ejerciciosel == 1){
            JOptionPane.showMessageDialog(null, "Corriendo... ");
                double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo de Ejercicio: "));
                double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad: "));
                appEjercitar.caminar(velocidad, tiempo);
                JOptionPane.showMessageDialog(null, "Datos: " + appEjercitar);
        }
        else if (ejerciciosel == 2){
            JOptionPane.showMessageDialog(null, "Caminar... ");
                double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo de Ejercicio: "));
                double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad: "));
                appEjercitar.caminar(velocidad, tiempo);
                JOptionPane.showMessageDialog(null, "Estos son los datos dados: " + appEjercitar);
        }
        else if (ejerciciosel == 3){
             JOptionPane.showMessageDialog(null, "Haciendo Burpees... ");
                double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo de Ejercicio: "));
                int repeticiones = Integer.parseInt(JOptionPane.showInputDialog("Velocidad: "));
                appEjercitar.burpees(repeticiones, tiempo);
                JOptionPane.showMessageDialog(null, "Estos son los datos dados: " + appEjercitar);
        }
        else if (ejerciciosel == 4){
            JOptionPane.showMessageDialog(null, "Saltando Cuerda... ");
                double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo de Ejercicio: "));
                int saltos = Integer.parseInt(JOptionPane.showInputDialog("Velocidad: "));
                appEjercitar.saltarCuerda(saltos, tiempo);
                JOptionPane.showMessageDialog(null, "Estos son los datos dados: " + appEjercitar);
            
            }
        
        else if (ejerciciosel == 5){
            JOptionPane.showMessageDialog(null, "Ejercicio en bicicleta... ");
                double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo de Ejercicio: "));
                appEjercitar.bicicleta(tiempo);
                JOptionPane.showMessageDialog(null, "Estos son los datos dados: " + appEjercitar);
        }
        else if (ejerciciosel == 6){
            JOptionPane.showMessageDialog(null, "Realizando sentadillas... ");
                double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Tiempo de Ejercicio: "));
                appEjercitar.sentadillas(tiempo);
                JOptionPane.showMessageDialog(null, "Estos son los datos dados: " + appEjercitar);
            
        }else
            JOptionPane.showMessageDialog(null,"Inserte una opción válida");
            
    
        
        
        
        
    
    }
    
    
  
    
}


