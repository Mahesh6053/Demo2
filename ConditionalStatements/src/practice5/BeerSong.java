package practice5;

public class BeerSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=99;i>0;i--)
		{
			sing(i);
		}
		
	}

	public static void sing(int i) {
		System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
		System.out.println("take one down, pass it around, " + (i-1) + " bottles of beer on the wall!"); 
	}
}
