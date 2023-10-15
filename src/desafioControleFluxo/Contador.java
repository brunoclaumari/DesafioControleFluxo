package desafioControleFluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

import desafioControleFluxo.exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		try (Scanner terminal = new Scanner(System.in)) {
			try {
				System.out.println("Digite o primeiro número");
				int primeiroNumero = terminal.nextInt();
				System.out.println("Digite o segundo número (Deve ser maior que o primeiro)");
				int segundoNumero = terminal.nextInt();

				System.out.println("ha");
				contar(primeiroNumero, segundoNumero);
			} catch (ParametrosInvalidosException ex) {
				System.out.println("Ocorreu um erro: " + ex.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Digite apenas números!!");
			} catch (Exception e) {
				System.out.println("Ocorreu um erro não esperado");
			}
		}
	}

	static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
		if (primeiroNumero > segundoNumero) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int quantidade = segundoNumero - primeiroNumero;
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Imprimindo o número " + (i + 1));
		}
	}

}
