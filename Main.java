package fila_onibus;

import java.util.Scanner;

public class Main {
	
	//Nesse programa, cada ônibus levará 16 pessoas de uma fila
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila fila = new Fila();
		
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 - Adicionar pessoas a fila");
			System.out.println("2 - Exibir quantidade de pessoas dentro da fila");
			System.out.println("3 - Mandar ônibus");
			System.out.println("0 - Sair");
			System.out.print("-> ");
			int opcao = input.nextInt();
			
			if (opcao == 0) {
				System.out.println("Até mais");
				break;
			} else if (opcao == 1) {
				System.out.println("Quantas pessoas entram na fila?");
				System.out.print("-> ");
				int pessoas = input.nextInt();
				
				int quantidade = 1;
				
				while (pessoas > 0) {
					fila.enqueue(quantidade);
					quantidade += 1;
					pessoas -= 1;
				}
			} else if (opcao == 2) {
				System.out.println("---------------------------------");
				System.out.println("A fila do ônibus possui " + fila.size() + " pessoas.");
			} else if (opcao == 3) {
				for (int i = 0; i < 16; i++) {
					if (fila.size() == 0) {
						break;
					}
					
					fila.dequeue();
				}
				System.out.println("---------------------------------");
				System.out.println("Ônibus enviado.");
			} else {
				System.out.println("Opção inválida, por favor, insira uma opção válida");
			}
		}

	}

}
