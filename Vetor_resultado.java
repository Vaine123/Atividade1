import java.util.Scanner;
public class Vetor_resultado {

	public static void main(String[] args) {
		int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        Scanner sc = new Scanner(System.in);

        int j = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor 1: ");
            vet1[i] = sc.nextInt();
            vet3[j - 1] = vet1[i];
            j++;

            System.out.print("Digite o elemento " + (i + 1) + " do vetor 2: ");
            vet2[i] = sc.nextInt();
            vet3[j - 1] = vet2[i];
            j++;
        }

        System.out.println("Vetor 3:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet3[i] + " ");
        }
        sc.close();
	}

}