package br.edu.figurasgeometricasplanas;
public class Hexagono {

	private double lado;
	private double areaH;
	
	public Hexagono() {
		lado = 10;
		areaH = 0;
		
	} public void recebeLado(double pLado) {
		lado = lado;
	} public void calcAreaH() {
		areaH = (3 * Math.sqrt(3) * (lado * lado)) / 2;
	} public void mostrarAreaH() {
		System.out.println("Área: " + areaH);
	} public double mostrarAreaHComRetorno() {
		System.out.println("Área com Retorno: " + areaH);
		return areaH;
	}
} 