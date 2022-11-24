package practice5;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for( i=0;i<=100;i++) {
			if(i%5==0 || i%10==0 || i%2==0) {
				continue;
			}
			else
				System.out.println(i);
		}
      System.out.println("total values:"+i);
	}

}
