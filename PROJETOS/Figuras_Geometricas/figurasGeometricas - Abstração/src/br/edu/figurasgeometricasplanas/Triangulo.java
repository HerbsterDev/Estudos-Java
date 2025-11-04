package br.edu.figurasgeometricasplanas;
public class Triangulo {

	private double base;
	private double altura;
	private double areaT;
	
	public Triangulo() {
		base = 10;
		altura = 10;
		areaT = 0;
		
	} public void recebeAltura(double pAltura) {
		altura = altura;
	} public void recebeBase(double pBase) {
		base = base;
	} public void calcAreaT() {
		areaT = (base * altura) /2;
	} public void mostrarAreaT() {
		System.out.println("Área: " + areaT);
	} public double mostrarAreaTComRetorno() {
		System.out.println("Área com Retorno: " + areaT);
		return areaT;
	}
} 