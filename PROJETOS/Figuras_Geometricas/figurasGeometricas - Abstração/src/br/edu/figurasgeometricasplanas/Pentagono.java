package br.edu.figurasgeometricasplanas;
public class Pentagono {

	private double perimetro;
	private double apotema;
	private double areaPe;
	
	public Pentagono() {
		perimetro = 10;
		apotema = 10;
		areaPe = 0;
		
	} public void recebePerimetro(double pPerimetro) {
		perimetro = perimetro;
	} public void recebeApotema(double pApotema) {
		apotema = apotema;
	} public void calcAreaPe() {
		areaPe = (perimetro * apotema) / 2;
	} public void mostrarAreaPe() {
		System.out.println("Área: " + areaPe);
	} public double mostrarAreaPeComRetorno() {
		System.out.println("Área com Retorno: " + areaPe);
		return areaPe;
	}
} 