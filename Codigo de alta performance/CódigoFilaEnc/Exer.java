package filas;

import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
		FilaInt fila = new FilaInt();
		fila.init();
		
		
		Scanner sc = new Scanner(System.in);
		int valor;
		System.out.println("Informe valor neiro posiivo para enfileirar ou" + "negativo para encerrar");
		valor = sc.nextInt();
		while (valor >= 0) {
			System.out.println("Informe valor inteiro postivo para enfleirar " + "negativo para encerrar");
			valor = sc.nextInt();
		}
		while(!fila.isEmpty()) {
			System.out.println("Valor retirado: "+ fila.dequeue());
			sc.close();
		}
	}
}
