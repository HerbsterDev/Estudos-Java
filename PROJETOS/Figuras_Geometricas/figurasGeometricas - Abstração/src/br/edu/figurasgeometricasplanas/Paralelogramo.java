package br.edu.figurasgeometricasplanas;
public class Paralelogramo {

	private double base;
	private double altura;
	private double areaP;
	
	public Paralelogramo() {
		base = 10;
		altura = 10;
		areaP = 0;
		
	} public void recebeBase(double pBase) {
		base = base;
	} public void recebeAltura(double pAltura) {
		altura = altura;
	} public void calcAreaP() {
		areaP = base * altura;
	} public void mostrarAreaP() {
		System.out.println("Área: " + areaP);
	} public double mostrarAreaPComRetorno() {
		System.out.println("Área com Retorno: " + areaP);
		return areaP;
	}
} 