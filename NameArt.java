/********************************
* Nameart.java
*********************************
* Project 1 - "Name in code" - outputs my name in a creative way to the display screen
* -------------------------------
* Jerry Hutchins
* 01/25/2019
* CMSC 255 002
*********************************/

public class NameArt {
	public static void printHeading() {
		System.out.println("Jerry Hutchins");
		System.out.println("Project 1 - Name in code");
		System.out.println("Outputs my name in a unique way on the display screen");
		System.out.println("01/25/2019");
		System.out.println("CMSC 255 002");
		System.out.println();
	}
	
	public static void main(String [] args){
		printHeading();
		System.out.println("    ___          ___           ___           ___");
		System.out.println("   /  /\\        /  /\\         /  /\\         /  /\\          ___");     // In order to print the "\" I had to include an additional \ after every incidence so that the program didn't assume illegal use of escape characters.
		System.out.println("  /  /:/       /  /:/_       /  /::\\       /  /::\\        /__/|");      // This causes the code within the program to look out of place, but the additional \'s are omitted once the program runs.
		System.out.println(" /__/::\\      /  /:/ /\\     /  /:/\\:\\     /  /:/\\:\\      |  |:|");
		System.out.println(" \\__\\/\\:\\    /  /:/ /:/_   /  /:/~/:/    /  /:/~/:/      |  |:|");
		System.out.println("    \\  \\:\\  /__/:/ /:/ /\\ /__/:/ /:/___ /__/:/ /:/___  __|__|:|");
		System.out.println("     \\__\\:\\ \\  \\:\\/:/ /:/ \\  \\:\\/:::::/ \\  \\:\\/:::::/ /__/::::\\");
		System.out.println("     /  /:/  \\  \\::/ /:/   \\  \\::/~~~~   \\  \\::/~~~~     ~\\~~\\:\\");
		System.out.println("    /__/:/    \\  \\:\\/:/     \\  \\:\\        \\  \\:\\           \\  \\:\\");
		System.out.println("    \\__\\/      \\  \\::/       \\  \\:\\        \\  \\:\\           \\__\\/");
		System.out.println("                \\__\\/         \\__\\/         \\__\\/");
	}
} 