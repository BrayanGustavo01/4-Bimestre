import java.util.Scanner;
public class ex3_vetoresInvertidos {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			b[i] = a[9 - i];
		}
		
		System.out.print("\nB = ");
		for(i = 0; i < 10; i++) {
			System.out.print(b[i] + " ");
		}
		ler.close();
	}
}
