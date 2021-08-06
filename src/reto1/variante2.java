/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author Pruebas W10
 */
public class variante2 {
    public class SIMCard{
    //Inserte acá los atributos
    
    public String empresaTelefonia = "HI";
    public double saldo = 0;
    public String numeroTelefono;
    public boolean celularApagado = true;
    public boolean modoAvionActivado = false;
    public boolean datosActivados = false;
    public int saldoDatos = 0;
    
    //Inserte acá el método constructor
    
    public SIMCard(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void comprarDatos(int c){
        double costoDatos;
        if (c < 10){
            costoDatos = double c * 3000;
        }
        
        
    }
    
    public void consumirDatos(int c){
        
       
    }
    
    public void llamar (int s){
       
    }
    
    public void recargarSaldo (double s){
        saldo = s + saldo;
    }
    
    public void gestionarEncendidoCelular(){
       
    }
    
    public void gestionarModoAvion(){
        
    }
    
    public void gestionarDatos(){
      
        
    }
    
    //Inserte acá los SETTERS Y GETTERS
    
    public String getEmpresaTelefonia(){
        return empresaTelefonia;
    }
    
    public void setEmpresaTelefonia(String empresaTelefonia){
        this.empresaTelefonia = empresaTelefonia;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getNumeroTelefono(){
        return numeroTelefono;
    }
    
    public void setNumeroTelefono(String NumeroTelefono){
        this.numeroTelefono = NumeroTelefono;
    }
    
    public boolean isCelularApagado(){
        return celularApagado;
    }
    
    public boolean isModoAvionActivado(){
        return modoAvionActivado;
    }
    
    public boolean isDatosActivados(){
        return datosActivados;
    }
    
    public int getSaldoDatos(){
        return saldoDatos;
    }
    
    public void setSaldoDatos(int saldoDatos){
        this.saldoDatos = saldoDatos;
    }
}
}
