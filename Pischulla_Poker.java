import java.util.Scanner;
public class Pischulla_Poker {
	Pischulla_Poker()
	{
		
	}

	public static void main(String[] args) {
		Deck newDeck = new Deck();
		
		
		Scanner SC = new Scanner(System.in);
		
		String[] temp = new String[5];
		Boolean[] replace = new Boolean[5];
		
		System.out.println("Welcome to Poker");
		newDeck.shuffle();
		System.out.println("The Deck is shuffled");
		System.out.println(newDeck.toString());
		FiveCardHand Hand1 = new FiveCardHand(newDeck.deal(5));
		FiveCardHand Hand2 = new FiveCardHand(newDeck.deal(5));
		System.out.println("Player Hand");
		System.out.println(Hand1.toString());
		System.out.println("The House has received their 5 cards");
		System.out.println("Which cards would you like to replace *Type yes to replace or no to keep cards*");
		System.out.println("Would you like to replace card # 1 ?");
		temp[0] = SC.nextLine();
		for(int i = 1; i < 5; i++)
		{
			System.out.println("Would you like to replace card #" + (i+1) + " ?");
			temp[i] = SC.nextLine();
		}
		
	
		for(int i=0; i<5; i++)
		{
			if(temp[i].equals("yes"))
			{
				replace[i]=true;
				System.out.println("Replacing card at "+ i);
			}
			if(temp[i].equals("no"))
			{
				replace[i]= false;
			}
			
		}
		
		Hand1.exchange(replace, newDeck);
		System.out.println("Players Hand");
		System.out.println(Hand1.toString());
		System.out.println("House's Hand");
		System.out.println(Hand2.toString());
		System.out.println("Remainder of Deck");
		System.out.println(newDeck.toString());
		
		System.out.println("Discard Pile");
		System.out.println(Hand1.DiscardPile());
		
		String[] Hand = new String[5];
		Hand = Hand1.ImageToString();
		for(int i =0; i < Hand.length; i++)
		{
			System.out.println(Hand[i]);
		}
		
		
		

	}

}
