package strings.com;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the input: ");
		String input = sc.nextLine();
		
		String rev="";
		for(int i=input.length()-1; i>=0; i--)
		{
			try {
			rev+=input.charAt(i);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("try to aceess out of range elements");
				break;
			}
		}
		System.out.println("rev string is: "+rev);
		
		if(rev.equals(input))
		{
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not a palindrome");
		sc.close();

	}

}
