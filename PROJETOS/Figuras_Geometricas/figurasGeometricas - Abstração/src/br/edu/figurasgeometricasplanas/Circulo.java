package br.edu.figurasgeometricasplanas;
public class Circulo {

	private double raio;
	private double areaC;
	
	public Circulo() {
		raio = 10;
		areaC = 0;
		
	} public void recebeRaio(double pRaio) {
		raio = raio;
	} public void calcAreaC() {
		areaC = Math.PI * (raio * raio);
	} public void mostrarAreaC() {
		System.out.println("Área: " + areaC);
	} public double mostrarAreaCComRetorno() {
		System.out.println("Área com Retorno: " + areaC);
		return areaC;
	}
} 