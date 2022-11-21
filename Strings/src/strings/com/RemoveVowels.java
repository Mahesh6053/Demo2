package strings.com;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String name = "mahesh";
		
		String s1=" ";
		
		s1=name.replaceAll("[aeiou]","");
		
		System.out.println(s1);
		
		
	}

}
