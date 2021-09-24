package jokenpoh;

import java.util.Scanner;

public class jokenpoh {

	public static void main(String[] args) {
		int jogador, pc;
		Scanner teclado = new Scanner(System.in);
		System.out.println("______JokenPô______");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a opção desejada: ");

		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu: Pedra!");
			break;
		case 2:
			System.out.println("Jogador escolheu: Papel!");
			break;
		case 3:
			System.out.println("Jogador escolheu: Tesoura!");
			break;
		default:
			System.out.println("Opção inválida!!!");
		}
		pc = (int) (Math.random() * 3 + 1);
		teclado.close();

		switch (pc) {
		case 1:
			System.out.println("Computador escolheu: Pedra!");
			break;
		case 2:
			System.out.println("Computador escolheu: Papel!");
			break;
		case 3:
			System.out.println("Computador escolheu: Tesoura!");
			break;
		}
		System.out.println("");
		if (jogador == pc) {
			System.out.println("JOGADORES EMPATARAM!");
		} else {
			if ((jogador == 1 && pc == 3) || (jogador == 2 && pc == 1) || (jogador == 3 && pc == 2)) {
				System.out.println("JOGADOR VENCEU!");
			} else {
				System.out.println("COMPUTADOR VENCEU!");
			}
		}
	}

}
