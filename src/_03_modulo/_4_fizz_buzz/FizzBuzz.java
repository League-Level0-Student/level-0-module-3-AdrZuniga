
package _03_modulo._4_fizz_buzz;

/**
 * Fizz Buzz
 * 
 * In this project, we're going to build FizzBuzz. It's a children's game where
 * you count from 1 to 20. Easy, right? Here's the catch:
 * 
 * Instead of saying a number that is divisible by 3, say "Fizz". And instead of
 * saying a number that is divisible by 5, say "Buzz". For numbers divisible by
 * both 3 and 5, say "FizzBuzz".
 * 
 * Print your results to the console.
 * 
 * If your code is correct, the output will be:
 * 
 * 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
 * 
 **/

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {

			// and -> && if( i% 1 == 0 && i %78 ==0)

			if (i % 3 == 0) {
				System.out.print("fizz");
			} else if (i % 5 == 0) {
				System.out.print("buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("fizz buzz");
			}
			else {
				System.out.println(i);
			}

			// for(int i = 0; i < 4; i++)

			if (i % 1 == 0) {
				System.out.print("fizz");
			}

			if (i % 4 == 0) {
				System.out.print("buzz fizz");
			}
			if (i % 7 == 0) {
				System.out.print("fizz buzz");
			}
			if (i % 11 == 0) {
				System.out.print("fizz");
			}

		}

	}

}
