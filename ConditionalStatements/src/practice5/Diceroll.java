package practice5;

import java.util.Scanner;

public class Diceroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=0;
		System.out.println("Let's play Rolling Java. Type anything to");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		System.out.println("Great, here are the rules:\n");
		System.out.println("- If you roll a 6, the game stops.");
		System.out.println("- If you roll a 4, nothing happens.");
		System.out.println("- Otherwise, you get 1 point.\n");
		System.out.println(" You must collect at least 3 points to win.");
		System.out.println("enter anything to roll");
		
		while(true) {
			sc.nextLine();
			int diceroll=dice();
			if(diceroll==6) {
				System.out.println("End of game");
				break;
				}
			else if(diceroll==4) {
				System.out.println("Zero points keep go on...");
					
				}
			else {
				score+=1;
				System.out.println("one point keep rolling");
			}
		}
			System.out.println("your score is "+score);
		if(score>=3) {
			System.out.println("Wow, that's lucky. You win!");
		}
		else
			System.out.println("Tough luck, you lose :(");
		sc.close();
		}
		
	
	
	public static int dice()
	{
		int val=(int) (Math.random()*6);
		val+=1;
		System.out.println("you rolled a:"+val);
		return val;
	}
	

}
