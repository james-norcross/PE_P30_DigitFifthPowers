package projecteuler.problem30;

import java.util.ArrayList;

public class DigitFifthPowers {

	/**
	 * Author: James Norcross
	 * Date: 12/24/14
	 * Purpose: Solution of Project Euler problem 30
	 * Description:  Finds the sum of numbers N which are equal to the sum of the fifth powers of their digits
	 */
	public static void main(String[] args) {
		
		// create an array of 5th powers
		int[] fifthPowers = new int[10];
		for (int i=0; i<10; i++) {
			fifthPowers[i] = i*i*i*i*i;
		}
		
		ArrayList<Integer> winners = new ArrayList<Integer>();
		int sumOfPowers, number, total = 0;
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					for (int l=0; l<10; l++) {
						for (int m=0; m<10; m++) {
							for (int n=0; n<10; n++) {
								sumOfPowers = fifthPowers[i] + fifthPowers[j] + fifthPowers[k] + fifthPowers[l] + fifthPowers[m] + fifthPowers[n];
								number = (100000*i) + (10000*j) + (1000*k) + (100*l) + (10*m) + n;
								if (sumOfPowers == number) {
									if ((number != 0) && (number != 1)) {
										winners.add(number);
										total += number;
									}
								}
							}
						}
					}
				}
			}
		}
		
		for(Integer i : winners)
			System.out.println(i);
		
		System.out.println("The total is " + total);
	}

}
