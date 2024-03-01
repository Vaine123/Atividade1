package logica_programacao;

import java.util.Scanner;

public class Media {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//float n1 = 1.6f;
			//float n2 = 3.5f;
			//float n3 = 2.7f;
			//float media = (n1 + n2 + n3) / 3;
			
			//System.out.printf("%.3f\n" , media);
			
			/*Orientação à Objetos
			é uma forma de organização que permite a criação de classes e subclasses, 
			de modo que se crie objetos com suas caracteristicas.
			
			Ex.: temos professores, alunos e funcionarios em um colégio. Sendo assim,
			de início pode parecer que eles são diferentes, com suas características próprias,
			mas todos possuem a mesma base, derivando do mesmo conceito: PESSOA
			
			Todos eles são pertencentes à Classe Pessoa(Ela contém nome, cpf, idade, endereço, contato, etc)
			Sendo assim, quando vamos falar de funcionario ou aluno, nós derivamos e especializamos aquela
			classe em uma subclasse, que vai conter caracteristicas exclusivas de Alunos e Funcionarios:
			
			
			Classe Pessoas(Nome, cpf, endereço...)
			
						Alunos(nome, cpf, endereço, cód. do aluno, turma, turno, n, de chamada)
						leonardo, kyria
			
						Funcionarios(nome, cpf, endereço, sálario, carga horária, Area de trabalho)
						Erinaldo
			
			Como é possível ver, tanto o funcionário como o aluno possuem um nome e cpf, mas nenhum aluno possui salário,
			assim como nenhum funcionário possui um cód de aluno.
			*/
			
			float n1, n2, n3;
			
			//classe/objeto/ construtor     
			Scanner sc = new Scanner(System.in);
			
			System.out.println("informe um valor para o nº um:");
			n1 = sc.nextFloat();
			
			System.out.println("informe um valor para o nº dois:");
			n2 = sc.nextFloat();
			
			System.out.println("informe um valor para o nº três:");
			n3 = sc.nextFloat();
			
			float media = ((n1+n1+n3)/3);
			
			
			/*Esse comando irá fazer um print que irá realocar cada
			uma das variáveis presentes no final, seguindo a ordem do %f.
			*/
			System.out.printf("A média de %.0f, %.0f e %.0f é igual a %.2f", n1, n2, n3, media);
			
			sc.close();
			

		}

}
