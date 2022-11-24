package practice5;

import java.util.Scanner;

public class BlackJackGame {

	public static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ready!, please hit something to start the game:");
		
		sc.nextLine();
		int card1=randomCards();
		int card2=randomCards();
		System.out.println("Dealer shows your cards:");
		System.out.println("You get a\n "+dealerCard(card1));
		
		//System.out.println(firstCard);
		System.out.println("and\n"+dealerCard(card2));
		
		//System.out.println(SecCard);
		int total=Math.min(card1,10)+Math.min(card2,10);
		System.out.println("Your total is "+total);
		
		int dealercard1=randomCards();
		int dealercard2=randomCards();
		
		System.out.println("The dealer shows\n"+dealerCard(dealercard1));
		
		System.out.println("and has a card facing down\n"+dealerCard(dealercard2));
		int dealertotal=Math.min(dealercard1,10)+Math.min(dealercard2,10);
		System.out.println("The dealer's total is hidden");
		
		
		
		while(true)
		{
			String options=hit();
			if(options.equals("stay")) 
			{
				break;
			}
			int cardR=randomCards();
			System.out.println("You get a\n"+dealerCard(cardR));
			total+=Math.min(cardR,10);
			System.out.println("Your total is:"+total);
			
			if(total>21) {
				System.out.println("You lose");
				System.exit(0);
			}
			
		}
		System.out.println("Now, it's the dealers turn");
		System.out.println("The dealer cards are\n"+dealerCard(dealercard1));
		System.out.println("and\n"+dealerCard(card2));
		
		System.out.println("dealers hidden card is \n"+dealerCard(card2));
		System.out.println("The Dealer total is:"+dealertotal);
		while(dealertotal<17)
		{
			
			int cardDr=randomCards();
			System.out.println("dealer card is: "+dealerCard(cardDr));
				dealertotal+=Math.min(cardDr,10);
				System.out.println("The Dealer total is:"+dealertotal);
				if(dealertotal>21) {
					System.out.println("you lost! player won");
					
				}
				if(total>dealertotal)
				{
					System.out.println("dealer won! player bust");
				}	
				else
					System.out.println("player won!, dealer bust");
			}
		}
		
		
		
		
		

	
	
	
	public static int randomCards() {
		int randomCard=(int)(Math.random()*13);
		randomCard++;
		return randomCard;
	}
	public static String dealerCard(int cardNumber) {
		
		switch(cardNumber)
		{
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
		default: return "nothing";
		
		
		
		}
		
	}
	public static String hit() {
		System.out.println("Would you like to Hit or Stay");
		String response=sc.nextLine();
		while(!(response.equals("hit")||response.equals("stay")))
		{
			System.out.println("Would you like to Hit or Stay");
			response=sc.nextLine();
		}
		return response;

	}

}
