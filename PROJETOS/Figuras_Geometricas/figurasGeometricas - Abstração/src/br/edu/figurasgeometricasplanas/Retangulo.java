package br.edu.figurasgeometricasplanas;
public class Retangulo {

	private double base;
	private double altura;
	private double areaR;
	
	public Retangulo() {
		base = 10;
		altura = 10;
		areaR = 0;
		
	} public void recebeBase(double pBase) {
		base = base;
	} public void recebeAltura(double pAltura) {
		altura = altura;
	} public void calcAreaR() {
		areaR = base * altura;
	} public void mostrarAreaR() {
		System.out.println("Área" + areaR);
	} public double mostrarAreaRComRetorno() {
		System.out.println("Área com Retorno: " + areaR);
		return areaR;
	}
} 
