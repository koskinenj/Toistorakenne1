import java.util.Random;
import java.util.Scanner;
public class lucky7 {

	public static void main(String[] args) {


		Random random = new Random();
		Scanner in = new Scanner(System.in);
	
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		int rahat = 0;
		String vastaus;
        String raha;
		
		System.out.println("**Tämä on peli joka arpoo kolme numeroa, jos yksi numeroista on 7, sinä voitat**");
		System.out.println("Syötä haluamasi rahamäärä, jokainen peli maksaa 1 euron");
		vastaus = in.nextLine();
		rahat = Integer.parseInt(vastaus);
	
		do
		{	
		randomNumber1 = random.nextInt(10) + 1;
		randomNumber2 = random.nextInt(10) + 1;
		randomNumber3 = random.nextInt(10) + 1;	
		
		if(rahat > 0)
		{		
		   System.out.println("Peli arpoi sinulle numerot " + randomNumber1 + "," + randomNumber2 + "," + randomNumber3);
		}
		else {
		break;}	
				

		if(randomNumber1 == 7 && randomNumber2 == 7 || randomNumber2 == 7 && randomNumber3 ==7 || randomNumber1 == 7 && randomNumber3 == 7)
		{

		   rahat = rahat+4;
		   System.out.println("Onnittelut, kaksi luvuista oli 7, voitit näin ollen 5 euroa!");		
		   System.out.println("Rahaa jäljellä " + rahat + " euroa.");	
		}
		else if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7)
		{
		   rahat = rahat+2;
		   System.out.println("Onnittelut, yksi luvuista oli 7 voitit näin ollen 3 euroa!");		
		   System.out.println("Rahaa jäljellä " + rahat + " euroa.");
		}
		else
		{
		   rahat--;
		   System.out.println("Mikään numeroista ei ollut 7, hävisit pelin");
		   System.out.println("rahaa jäljellä " + rahat);
		}
	       System.out.println("Haluatko pelata uudestaan?");
	       System.out.println("Jos haluat pelata, paina enter");
	       System.out.println("Jos et halua enää pelata, kirjoita e ja paina enter");
	       vastaus = in.nextLine();
		   	   	   
		}while(rahat == 0 || !vastaus.equals("e"));
			
		if(rahat == 0 || vastaus.equals("e"))
		{
		   System.out.println("Kiitoksia pelaamisesta!");
		}													
		
	}

}
