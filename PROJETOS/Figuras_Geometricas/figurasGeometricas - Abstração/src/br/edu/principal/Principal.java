package br.edu.principal;
import br.edu.figurasgeometricasplanas.*;
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Triângulo");
		Triangulo fg1 = new Triangulo();
		fg1.recebeAltura(5);
		fg1.recebeBase(5);
		fg1.calcAreaT();
		fg1.mostrarAreaT();
		double recebeAreaT = fg1.mostrarAreaTComRetorno();
		
		System.out.println(" ");
		System.out.println("Quadrado");
		Quadrado fg2 = new Quadrado();
		fg2.recebeLado(5);                                                                                                
		fg2.calcAreaQ();
		fg2.mostrarAreaQ();
		double recebeAreaQ = fg2.mostrarAreaQComRetorno();
		
		System.out.println(" ");
		System.out.println("Retângulo");
		Retangulo fg3 = new Retangulo();
		fg3.recebeAltura(5);
		fg3.recebeBase(5);
		fg3.calcAreaR();
		fg3.mostrarAreaR();
		double recebeAreaR = fg3.mostrarAreaRComRetorno();
		
		System.out.println(" ");
		System.out.println("Circulo");
		Circulo fg4 = new Circulo();
		fg4.recebeRaio(5);
		fg4.calcAreaC();
		fg4.mostrarAreaC();
		double recebeAreaC = fg4.mostrarAreaCComRetorno();
		
		System.out.println(" ");
		System.out.println("Losango");
		Losango fg5 = new Losango();
		fg5.recebeMaiorD(5);
		fg5.recebeMenorD(5);
		fg5.calcAreaL();
		fg5.mostrarAreaL();
		double recebeAreaL = fg5.mostrarAreaLComRetorno();
		
		System.out.println(" ");
		System.out.println("Trapézio");
		Trapezio fg6 = new Trapezio();
		fg6.recebeMaiorB(5);
		fg6.recebeMenorB(5);
		fg6.recebeAltura(5);
		fg6.calcAreaTp();
		fg6.mostrarAreaTp();
		double recebeAreaTp = fg6.mostrarAreaTpComRetorno();
		
		System.out.println(" ");
		System.out.println("Paralelogramo");
		Paralelogramo fg7 = new Paralelogramo();
		fg7.recebeAltura(5);
		fg7.recebeBase(5);
		fg7.calcAreaP();
		fg7.mostrarAreaP();
		double recebeAreaP = fg7.mostrarAreaPComRetorno();
		
		System.out.println(" ");
		System.out.println("Hexagono");
		Hexagono fg8 = new Hexagono();
		fg8.recebeLado(5);
		fg8.calcAreaH();
		fg8.mostrarAreaH();
		double recebeAreaH = fg8.mostrarAreaHComRetorno();
		
		System.out.println(" ");
		System.out.println("Pentagono");
		Pentagono fg9 = new Pentagono();
		fg9.recebePerimetro(5);
		fg9.recebeApotema(5);
		fg9.calcAreaPe();
		fg9.mostrarAreaPe();
		double recebeAreaPe = fg9.mostrarAreaPeComRetorno();
	}
}
