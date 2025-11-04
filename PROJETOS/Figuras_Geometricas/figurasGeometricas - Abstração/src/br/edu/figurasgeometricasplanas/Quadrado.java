package br.edu.figurasgeometricasplanas;
public class Quadrado {

	private double lado;
	private double areaQ;
	
	public Quadrado() {
		lado = 10;
		areaQ = 0;
		
	} public void recebeLado(double pLado) {
		lado = lado;
	} public void calcAreaQ() {
		areaQ = lado * lado;
	} public void mostrarAreaQ() {
		System.out.println("Área: " + areaQ);
	} public double mostrarAreaQComRetorno() {
		System.out.println("Área com Retorno: " + areaQ);
		return areaQ;
	}
} 