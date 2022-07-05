package problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class JogandoCartasFora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		while(true) {
			valor = sc.nextInt();
			if(valor == 0) break;
			Deque<Integer> pilha = new ArrayDeque<Integer>();  
			int aux = valor;
			while(aux > 0) {
				pilha.addFirst(aux);
				aux--;
			}
			int estado = 0;
			System.out.print("Discarded cards: ");
			while(pilha.size() > 1) {
				if(estado == 0) {
					if(pilha.size() <= 2) {
						System.out.print(pilha.getFirst());
					} else {
						System.out.print(pilha.getFirst()+", ");
					}
					pilha.pop();
					estado = 1;
				} else {
					int topo = pilha.getFirst();
					pilha.pop();
					pilha.addLast(topo);
					estado = 0;
				}
			}
			System.out.println();
			System.out.println("Remaining card: "+ pilha.peek());
		}
		sc.close();
	}

}
