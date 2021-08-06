/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;
import java.util.*;
/**
 *
 * @author Pruebas W10
 */
public class variante1 {
    
public class Personaje {
	//Inserte aca los atributos
	private String nombre;
	private char sexo;
	private double posicionX=0;
	private double posicionY=0;
	private double distanciaTotal=0;
	private int numeroBotiquines=0;
	private double vida=100;
	//Inserte aca el metodo constructor
	public Personaje(String nombre, char sexo) {
		this.nombre=nombre;
		this.sexo=sexo;
	}
	//inserta acá los metodos
	public void usarBotiquin () {
		
	}
	public void recogerBotiquin () {
		
	}
	public void moverDerecha (double d) {
		
	}
	public void moverIzquierda (double d) {
		
	}
	public void moverArriba (double d) {
		
	}
	public void moverAbajo (double d) {
		
	}
	public double calcularDistanciaRespectoOrigen () {
		
	}
	//ingrese aca los setters y getters  
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre () {
		return nombre;
	}
	public void setSexo (char sexo) {
		this.sexo = sexo;
	}
	public char getSexo () {
		return sexo;
	}
	public void setPosicionX (double posicionX) {
		this.posicionX = posicionX;
	}
	public Double getPosicionX () {
		return posicionX;
	}
	public void setPosicionY (double posicionY) {
		this.posicionY = posicionY;
	}
	public Double getPosicionY () {
		return posicionY;
	}
	public void setDistanciaTotal (double distanciaTotal) {
		this.distanciaTotal = distanciaTotal;
	}
	public Double getDistanciaTotal () {
		return distanciaTotal;
	}
	public void setNumeroBotiquines (int numeroBotiquines) {
		this.numeroBotiquines = numeroBotiquines;
	}
	public int getNumeroBotiquines() {
		return numeroBotiquines;
	}
	public void setVida (double vida) {
		this.vida = vida;
	}
	public Double getVida () {
		return vida;
	}
}
}
