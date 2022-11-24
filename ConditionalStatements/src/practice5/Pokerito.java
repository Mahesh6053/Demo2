package practice5;

import java.util.Scanner;

public class Pokerito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Let's play Pokerito. Type anything when you're ready.");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();

		System.out.println("It's like Poker, but a lot simpler.");

		System.out.println("- There are two players, you and the computer.");

		System.out.println("- The dealer will give each player one card.");

		System.out.println("- Then, the dealer will draw five cards (the river");

		System.out.println("- The player with the most river matches wins!");

		System.out.println("- If the matches are equal, everyone's a winner!");

		System.out.println("- Ready? Type anything if you are.");
		
		
		sc.nextLine();
		System.out.println("Here's your card: ");
		String yourcard=randomCard();
		System.out.println(yourcard);
		System.out.println("Here's Computer card:");
		String compCard=randomCard();
		System.out.println(compCard);
		System.out.println("now Dealer draw the 5 cards,please click on enter:");
		
		int count=0;
		int count1=0;
		for(int i=1;i<=5;i++) {
			sc.nextLine();
			System.out.println("card-"+i);
			String Draw=randomCard();
			System.out.println(Draw);
			if(Draw.equals(yourcard)) {
				count+=1;
			}
			if(Draw.equals(compCard))
				count1+=1;
		}
		if(count1<count) {
			System.out.println("Your no of matches-"+count);
			System.out.println("computer no of matches-"+count1);
			System.out.println("you win!");
		}
		else if(count1==count) {
			System.out.println("Your no of matches-"+count);
			System.out.println("computer no of matches-"+count1);
			System.out.println("Both wins");
			
		}
		else
			System.out.println("your no of matches-"+count+"\ncomputer no of matches-"+count1+"\ncomputer wins!");
		    
		
		
sc.close();
	}
	public static String randomCard()
	{
		int randomNum=(int) (Math.random()*13);
		randomNum+=1;
		//System.out.println(randomNum);
		switch(randomNum) {
		case 1:   
        return "   _____\n"+
               "  |A _  |\n"+ 
               "  | ( ) |\n"+
               "  |(_'_)|\n"+
               "  |  |  |\n"+
               "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  
            case 3:
            return"   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

            case 4:
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
            return  
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          

            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
		
		default:
		        return "This should not get called";
		}
		
	}

}
