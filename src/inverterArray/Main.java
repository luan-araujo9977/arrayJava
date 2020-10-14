package inverterArray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
													
		// INVERTENDO UM ARRAY

		int n = sc.nextInt();
		//String[] array = new String[n]; // { "Felipe", "Luis", "Camila", "Anderson", "Flavio" };
		String[] array = { "Felipe", "Luis", "Camila", "Anderson", "Flavio" };
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}

		String[] saida = new String[n];

		for (int i = array.length - 1; i >= 0; i--) {
			saida[i] = array[i];
			System.out.print(saida[i] + ", ");
		}

		sc.close();
	}
}
