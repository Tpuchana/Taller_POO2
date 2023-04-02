/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appfit_1;

import javax.swing.JOptionPane;
import personas.Persona;

/**
 *
 * @author tepuc
 */
public class Ejercitar {
    
    Persona usuario;
    double calorias;
    double tiempo;
    double distancia;
    double velocidad;
    double calque;
    int saltos;
    double imc;
    double calPeso;

    public Ejercitar(Persona usuario) {
        this.usuario = usuario;
        this.calorias = 0;
        this.tiempo = 0;        
        this.velocidad = 0;
        this.calque = 0;
        this.saltos = 0;
        this.imc = 0;
        this.calPeso = 0;
        
        
    }

    public Ejercitar(String nombre, int edad, double estatura, double peso) {
        this.usuario = new Persona(nombre, edad, estatura, peso);
        this.calorias = 0;
        this.tiempo = 0;        
        this.velocidad = 0;
        this.calque = 0;
        this.saltos = 0;
    }
    
     private void IMC() {
        imc = this.usuario.getPeso()/(this.usuario.getEstatura()*this.usuario.getEstatura());
        if (imc <18.5 && this.usuario.getEdad()>=18){
            JOptionPane.showMessageDialog(null, "Según tu indice de masa corporal tienes un peso bajo");
        }else if ((imc >=18.5 && imc <=24.9) && this.usuario.getEdad()>=18){
            JOptionPane.showMessageDialog(null, "Según tu indice de masa corporal tienes un peso normal");
        }else if ((imc >=25.0 && imc <=29.9) && this.usuario.getEdad()>=18){
            JOptionPane.showMessageDialog(null, "Según tu indice de masa corporal tienes sobrepeso");
        }else if (imc >=30.0 && this.usuario.getEdad()>=18){
            JOptionPane.showMessageDialog(null, "Según tu indice de masa corporal tienes obesidad");
        }
        
    }
    private void perderPeso(){
        if(this.calPeso>=3500){
    this.usuario.bajarPeso();
    this.calPeso=0;
    JOptionPane.showMessageDialog(null, "Felicidades, Has bajado 1 kg");
        }
    }
    
    
  
    
    private void correr (double distancia){
    double caloriasQuemadas= 1.03*this.usuario.getPeso()*distancia;
        this.calorias+=caloriasQuemadas;
        this.perderPeso();
        this.IMC();
        JOptionPane.showMessageDialog(null, "Corriendo...");
        
    }
    public void correr (double velocidad, double tiempo){
        double distancia = velocidad*tiempo/60;
        //recursividad
        this.correr(distancia);
        this.tiempo+=tiempo;
    }
    private void caminar(double distancia){        
        double calque = 0.73*this.usuario.getPeso()*distancia;
        this.calorias+= calque;
        this.perderPeso();
        JOptionPane.showMessageDialog(null, "Caminando...");
        this.IMC();
    }
    
    public void caminar(double velocidad, double tiempo){
        double distancia = velocidad*tiempo/60;
        this.correr(distancia);
        this.tiempo+=tiempo;
    }
    
    
    public void saltarCuerda (int saltos, double tiempo){        
        double calque = (saltos*tiempo*14)/(100*tiempo);
        this.calorias+= calque;
        this.tiempo+= tiempo;
        JOptionPane.showMessageDialog(null, "Saltando Lazo...");
        this.IMC();
        
        
        
    }
    public void burpees(int repeticiones, double tiempo){
        double calque = (repeticiones*tiempo*10)/(7*tiempo);
        this.calorias+= calque;
        this.tiempo+= tiempo;
        this.perderPeso();
        JOptionPane.showMessageDialog(null, "Burpees...");
        this.IMC();
    }
    
    public void bicicleta(double tiempo){
        double calque = 0.049*(this.usuario.getPeso()*2.2)*tiempo;
        this.calorias+= calque;
        this.tiempo+= tiempo;
        this.perderPeso();
        JOptionPane.showMessageDialog(null, "Bicicleta...");
        this.IMC();
    }
    
    public void sentadillas(double tiempo){
        double calque = 0.096*this.usuario.getPeso()*tiempo;
        this.calorias+= calque;
        this.tiempo+= tiempo;
        this.perderPeso();
        JOptionPane.showMessageDialog(null, "Haciendo Sentadillas...");
        this.IMC(); 
    }
    
     public double getImc() {
        return imc;
    }
     
     
     public void actualizarPeso (){
         JOptionPane.showMessageDialog(null, "El peso actual es de: "+ this.usuario.getPeso());
     }
     
     
    
     
        
        
    
}
