package br.edu.figurasgeometricasplanas;
public class Losango {

	private double maiorD;
	private double menorD;
	private double areaL;
	
	public Losango() {
		maiorD = 10;
		menorD = 10;
		areaL = 0;
		
	} public void recebeMaiorD(double pMaiorD) { 
		maiorD = maiorD;
	} public void recebeMenorD(double pMenorD) {
		menorD = menorD;
	} public void calcAreaL() {
		areaL = (maiorD * menorD) / 2;
	} public void mostrarAreaL() {
		System.out.println("Área: " + areaL);
	} public double mostrarAreaLComRetorno() {
		System.out.println("Área com Retorno: " + areaL);
		return areaL;
	}
} 