import java.util.*;


public class testingStuff {
	
	public static void main (String[] args) {
		
		//Here i ve defined an Integer and called it Wahl
		int Wahl;
		
		//Here i ve defined a Scanner and called it sc
		Scanner sc = new Scanner(System.in);
		
		//Here i defined my Usermenu which he will be able to choose from in the following code bracket
		System.out.println("Willkommen zu meinem Umrechner");
		System.out.println("Drücken Sie 1 für Euro zu Dollar");
		System.out.println("Drücken Sie 2 für Dollar zu Euro");
		
		//Here
		Wahl = sc.nextInt();
		
		//This is the Main bracket and i used an If Function connected to the choice which i defined as Wahl
		if(Wahl == 1) {
			float Euro = (float) 1.34;
			System.out.println("Bitte geben Sie die Menge in Euro ein");
			System.out.println("Das ergibt" + sc.nextFloat()  * Euro + "Euro");
		} else if (Wahl == 2) {
			float Dollar = (float) 0.64;
			System.out.println("Bitte geben Sie die Menge in Dollar ein");
			System.out.println("Das ergibt" + sc.nextFloat() * Dollar + "Dollar");
		} else if (Wahl > 2 || Wahl < 1) {
			System.out.println(" Bitte geben Sie einen Integer ein Danke ^^");
		}
		
			
	}

}
