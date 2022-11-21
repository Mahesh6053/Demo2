package strings.com;

public class RemoveAllSpecialCharactersFromString {

	public static void main(String[] args) {
		String s =" mahesh$3445babu833Amisagadda";
		s = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
	}

}
