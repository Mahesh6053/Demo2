package practice5;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 18; i++) {
//			System.out.println(i);
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println(i+"-Buzz");

			} else if (i % 3 == 0) {
				System.out.println(i+" -Fizz");
			}

		}

	}

}
