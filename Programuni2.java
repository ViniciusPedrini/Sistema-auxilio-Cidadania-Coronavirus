package INTRO;

import java.util.Scanner;

import java.time.LocalDateTime;

public class Programuni2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int anoNascimento;
		int anoAtual;
		String categoria;
		double beneficio = 0;
		int funcionarios;
		String aposentado;
		int desempregado;
		String estado = "rj";
		int mes = 0;
		double beneficioTotal;
		double beneficioExtra = 0;
		int opcao= 1;
		

		// Dados de entrada do programa

		Scanner teclado = new Scanner(System.in);

		while (opcao != 0) {
			
		
		
		System.out.println("Digite o nome completo:");
		nome = teclado.nextLine();

		System.out.println("Digite o ano de nascimento:");
		anoNascimento = teclado.nextInt();

		LocalDateTime data1 = LocalDateTime.now();
		anoAtual = data1.getYear();

		teclado.nextLine();

		System.out.println("Empregado, Empregador ou Desempregado:");
		categoria = teclado.nextLine();

		if (categoria.equalsIgnoreCase("empregado")) {

			System.out.println("Voce é aposentado?");
			aposentado = teclado.nextLine();

			System.out.println("Valor do beneficio deve ser entre 1000 e 1800:");
			beneficio = teclado.nextDouble();
			
			System.out.println("O beneficio do usuario sera 3 meses");
			mes = 3;
			
			teclado.nextLine();
		}

		else {
			if (categoria.equalsIgnoreCase("empregador")) {

				System.out.println("Quantos funcionarios?:");
				funcionarios = teclado.nextInt();

				
			if (funcionarios <=50){
				beneficio = funcionarios * 220;
				System.out.println("O valor do beneficio é de:" + beneficio);
			}else {
				beneficio = funcionarios * 200;
				System.out.println("O valor do beneficio é de:" + beneficio);
			}

				teclado.nextLine();

				System.out.println("Insira de 2 a 12 meses de beneficios:");
				mes = teclado.nextInt();

				teclado.nextLine();

			} else {
				if (categoria.equalsIgnoreCase("desempregado")) {
					System.out.println("Quantos meses desempregado?:");
					desempregado = teclado.nextInt();

					System.out.println("Valor do beneficio deve ser entre 1500 e 2300:");
					beneficio = teclado.nextDouble();
					
					System.out.println("Insira de 2 a 12 meses de beneficios.");
					mes = teclado.nextInt();

					teclado.nextLine();
				}
			}
		}

		System.out.println("Voce é de qual estado:");
		estado = teclado.nextLine();

		// processamento

		if (estado.equalsIgnoreCase("to")|| estado.equalsIgnoreCase("tocantins"))  {
			beneficioExtra = beneficio * 1.09;
			System.out.println("O beneficio do estado de tocantins é de: " + beneficioExtra);
		} else {
			if (estado.equalsIgnoreCase("sc") || estado.equalsIgnoreCase("santa catarina")) {
				beneficioExtra = beneficio * 1.05;
				System.out.println("O beneficio do estado de santa catarina é de: " + beneficioExtra);
			} else {
				if (estado.equalsIgnoreCase("pe") || estado.equalsIgnoreCase("pernambuco")) {
					beneficioExtra = beneficio * 1.14;
					System.out.println("O beneficio do estado de pernambuco é de: " + beneficioExtra);
				} else {
					if (estado.equalsIgnoreCase("am") || estado.equalsIgnoreCase("amazonas")) {
						beneficioExtra = beneficio * 1.11;
						System.out.println("O beneficio do estado de amazonas é de: " + beneficioExtra);
					} else {
						beneficioExtra = beneficio;
					}
				}
			}
		}

		

		// saida
		System.out.println("Nome completo: " + nome);
		System.out.println("Idade: " + (anoAtual - anoNascimento));
		System.out.println("Categoria: " + categoria);
		System.out.println("Beneficio: " + beneficio);
		System.out.println("Meses de beneficio: " + mes);
		System.out.println("Estado: " + estado);
		System.out.println("Beneficios do estado: " + beneficioExtra);
		System.out.println("Beneficio total: " + beneficioExtra * mes);
		
		System.out.println("Voce deseja cadastrar outro usuario?");
		System.out.println("Digite 1 para continuar e 0 para abortar:");
		opcao = teclado.nextInt();
		
		teclado.nextLine();
		

	}
		teclado.close();
	}
	
}
