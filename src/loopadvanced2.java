import java.util.Scanner;
public class loopadvanced2 {

	public static void main(String[] args) {	

		Scanner in = new Scanner(System.in);
		
		String answer;
		int guess = 0;
		
		do
		{
		      System.out.println("Guess my name (type stop to exit)");
		      answer = in.nextLine();
		      guess++;
		      if(!answer.equals("Emma"))
		      {
		      	  
		      }
		      else
		      {
		    	  System.out.println("Congratulations!\nYou guessed " + guess + " times.");
		      break;
		      }
		      
		}
		while(!answer.equals("stop"));		
		
	    if(answer.equals("stop"))
	    {
	        guess--; 
	    	System.out.println("You guessed " + guess + " times.");
	    }
			
		
	}

}
