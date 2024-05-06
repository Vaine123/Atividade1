import java.util.Scanner;
public class Vetor_de_nove_numeros {

	public static void main(String[] args) {
		int[] num = new int[9];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            int cont = 0;
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cont++;
                }
            }
            if (cont <= 2) {
                System.out.println("Número " + num[i] + " tem " + cont + " divisores.");
                System.out.println("Posição: " + (i + 1));
            }
            sc.close();
        }

	}

}