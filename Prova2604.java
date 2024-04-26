import java.util.Scanner;

public class Prova2604 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario_carlos, salario_joao;
		int  meses;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario de Carlos: ");
		salario_carlos = sc.nextFloat();
		salario_joao = salario_carlos/3;
		
		sc.close();
		
		meses = 0;
		
		while (salario_joao < salario_carlos) {
			salario_carlos += salario_carlos * 0.6f / 100;
			salario_joao += salario_joao * 1 / 100;
			meses++;
			System.out.printf("===================================\nMês: %d \nSalario Carlos: %.2f \nSalario João: %.2f\n\n", meses, salario_carlos, salario_joao);
		}
		System.out.printf("====================================\n\nO Salario de João levara %d meses para ultrapassar o de Carlos", meses);

	}

}
