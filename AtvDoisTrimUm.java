package logica_programacao;

import java.util.Scanner;

public class AtvDoisTrimUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//ATIVIDADE 2 DE 2:
				//Do salário bruto de um funcionário é descontado 11% para o INSS. Calcule e mostre o salário com desconto.
						
					float salario;
					float inss = 0.11f;
					Scanner sc = new Scanner(System.in);
						
					System.out.println("Vamos calcular o desconto do INSS do seu salário hipotético");
					System.out.println("Digite o seu salário abaixo: ");
					salario = sc.nextFloat();
						
					float salario_descontado = (salario * inss);
					float salario_inss =(salario - (salario_descontado));
						
						
					System.out.printf("O valor descontado foi de R$%.2f. Seu salário com o INSS descontado seria igual a R$%.2f", salario_descontado, salario_inss);
						


	}

}
