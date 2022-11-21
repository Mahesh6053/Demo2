package strings.com;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mahesh babu amisagadda";
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i-- )
		{
			rev+=s.charAt(i);
		}
		
		System.out.println("input String is: "+s+"\nReverse String is: "+rev);
	}

}
