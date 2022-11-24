package practice5;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl+c it will stop loop in console
		//u may this loopu donno how many times the loop will run or as long as something is true 
		int num=25;
		while(num<=30) {
			System.out.println(num);
			num++;
		}
		double guess=0.99;
		double choice=0.01;
		while(guess>choice) {
			guess=Math.random();
			System.out.println(guess);
		}

	}

}
