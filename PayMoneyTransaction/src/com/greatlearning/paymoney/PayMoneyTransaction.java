package com.greatlearning.paymoney;
import java.util.Scanner;

public class PayMoneyTransaction {
	public static void main(String args[]) 
	{
		System.out.println("WELCOME TO PAYMONEY  ");
		System.out.println("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the value of array : ");
		for (int i = 0; i < size; i++) 
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total number of targets that needs to be achieved : ");
		int targetNo = sc.nextInt();

		if (targetNo != 0) 
		{
			int j;
			int i;
			for (j = 0; j < targetNo; j++) 
			{
				System.out.println("Enter the value of target : ");
				int target = sc.nextInt();

				long sum = 0;
				for (i = 0; i < size; i++) 
				{

					sum = sum + arr[i];
					if (sum >= target)
						break;
				}
				if (sum >= target) 
				{
					System.out.println("Target achieved after " + (i + 1) + " transaction");

				} 
				else 
				{
					System.out.println("Given target is not achieved.");
				}
			}
		}
		sc.close();
	}
}




