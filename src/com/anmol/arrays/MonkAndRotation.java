package com.anmol.arrays;

import java.util.Scanner;

public class MonkAndRotation {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t != 0) {

			int n = sc.nextInt();
			int k = sc.nextInt();

			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int index = n - (k % n);

			for (int j = index; j < n; j++) {
				System.out.print(arr[j] + " ");
			}
			for (int l = 0; l < index; l++) {
				System.out.print(arr[l] + " ");
			}
			System.out.println();

			t = t - 1;
		}

		sc.close();
	}

}
