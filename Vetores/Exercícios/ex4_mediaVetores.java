import java.util.Scanner;
public class ex4_mediaVetores {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		
		double media;
		int a[], i, soma = 0;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
		}
		for(i = 0; i< TAM; i++) {
			soma = a[i] + soma;
		}
		media = (double) soma/10;
	
		System.out.println("A m�dia �: "+media);
		in.close();
	}
}
