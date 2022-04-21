package com.greatlearning.currencydenomination;
import java.util.*;

public class CurrencyDenomination {
	public static void main(String args[]) {
		System.out.println("WELCOME TRAVELLER ");
		System.out.println("Enter the size of currency denominations : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		System.out.println("Enter the currency denominataions value : ");
		Integer[] notes = new Integer[size];
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		Arrays.sort(notes, Collections.reverseOrder());

		int[] noteCounter = new int[size];

		System.out.println("Enter the value to pay : ");
		int amount = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / (notes[i]);
				amount = amount - noteCounter[i] * notes[i];
			}
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be : ");
		for (int i = 0; i < size; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
		sc.close();
	}

}
