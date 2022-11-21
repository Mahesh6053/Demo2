package strings.com;

public class StringConcatenate {

	static String s3;
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = new String("mahesh");
		String s5="Zenq";
		char[] a= {'Z','e','n','q'};
		
		String s4 = new String(a);
		System.out.println(s3);
		System.out.println(s1+" welcome "+s4+" "+s2);
		
		//literal-literal-->true
		//object-literal comparison-->false
		
		
		System.out.println(s5.equals(s4));
		if(s5.equals(s4))
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");

	}

}
