package br.edu.figurasgeometricasplanas;
public class Trapezio {

	private double maiorB;
	private double menorB;
	private double altura;
	private double areaTp;
	
	public Trapezio() {
		maiorB = 10;
		menorB = 10;
		altura = 10;
		areaTp = 0;
		
	} public void recebeMaiorB(double pMaiorB) {
		maiorB = maiorB;
	} public void recebeMenorB(double pMenorB) {
		menorB = menorB;
	} public void recebeAltura(double pAltura) {
		altura = altura;
	} public void calcAreaTp() {
		areaTp = (maiorB + menorB) * altura / 2;
	} public void mostrarAreaTp() {
		System.out.println("Área: " + areaTp);
	} public double mostrarAreaTpComRetorno() {
		System.out.println("Área com Retorno: " + areaTp);
		return areaTp;
	}
} 