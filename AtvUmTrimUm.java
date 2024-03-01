package logica_programacao;

import java.util.Scanner;

public class AtvUmTrimUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ATIVIDADE 1 DE 2:
		//Calcule e mostre a média ponderada de 4 valores informados pelo usuário.
		
		float n1, n2, n3, n4;
		int p1, p2, p3, p4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao contador de Média Ponderada.com");
		System.out.println("Digite o primeiro valor e, em seguida, o seu peso(Qtd de repetições):");
		n1 = sc.nextFloat();
		p1 = sc.nextInt();

		System.out.println("Digite o segundo valor e, em seguida, o seu peso(Qtd de repetições):");
		n2 = sc.nextFloat();
		p2 = sc.nextInt();

		System.out.println("Digite o terceiro valor e, em seguida, o seu peso(Qtd de repetições):");
		n3 = sc.nextFloat();
		p3 = sc.nextInt();
		
		System.out.println("Digite o quarto valor e, em seguida, o seu peso(Qtd de repetições):");
		n4 = sc.nextFloat();
		p4 = sc.nextInt();
		
		
		
		
		float mediaPonderada = ((n1*p1 + n2*p2 + n3*p3 + n4*p4)/(p1 +p2 + p3 + p4));
		
		System.out.printf("A média ponderada dos valores %.1f, %.1f, %.1f e %.1f é igual a %.2f", n1, n2, n3, n4, mediaPonderada);
		
		
		
		//ATIVIDADE 2 DE 2:
		//Do salário bruto de um funcionário é descontado 11% para o INSS. Calcule e mostre o salário com desconto.

	}

}



