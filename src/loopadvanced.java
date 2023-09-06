import java.util.Scanner;

public class loopadvanced {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	
	String answer;
	int num1;
	int num2;
	
	
	System.out.println("First number?");
    answer = in.nextLine();
	num1 = Integer.parseInt(answer);		

    System.out.println("Last number?");
    answer = in.nextLine();
    num2 = Integer.parseInt(answer);
	
    for (int counter = num1 ; counter <= num2 ; counter++)
    {
    	System.out.println(counter);
    }
				
	}

}
