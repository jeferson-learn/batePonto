package brincar;

import java.util.Scanner;

public class NumeroRepetir {

	public static void main(String[] args) {
		
		System.out.println("TESTE BRINCAR");
		Scanner input = new Scanner (System.in);
		System.out.println("Quantos numero que vc quer: ");
		int n = input.nextInt();
		if(n>=1) {			
			for(int i=1; i<=n; i++) {
				System.out.println();
				for (int j = 1; j <= n; j++) {
					if(i>=j) {						
						System.out.print(i+" ");
					}else {
						break;
					}
				}
			}			
		}else {
			System.out.println("Nao pode numero negativo ou zero");
		}

	}

}
