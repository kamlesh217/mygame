import java.util.Scanner;

public class Guessgame {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
	    gameIntro();

		System.out.println("Enter Your Details First");
		System.out.println("Your Name");
		String name= sc.nextLine();
		System.out.println("Your Age");
		int Age= sc.nextInt();
		System.out.println("Your Address");
		String Address= sc.next();	
	  
        setGameLevel();
        
        int level= sc.nextInt();
        
        System.out.println("Playey's Name: "+ name);
        System.out.println("Playey's Age:  "+ Age);
        System.out.println("do you want to start game then enter 1");
        
        gamePrivate(level);
            
	  }

	private static int startGame() {
		Scanner sc= new Scanner(System.in);
		
        int start= sc.nextInt();
		return start;
	}

	private static void gamePrivate(int level) {
		
		
		for(int i=0;i<23;i++) {
			int start= startGame();
			
		if(start==1) {
			
			if(level==1) {
				
				System.out.println("enter your guess");
			int[] easyNums= {45,79,35,48,68,52,78,48,665,32,78,95,1,24,56,95,94,65,35,24,25,61};
			gameLoop(easyNums[i]);	
		}
			
		if(level==2) {
			System.out.println("enter your guess");
			int[] medionNums= {145,278,295,494,365,435,224,348,195,321,424,156,479,335,448,268,152,278,365,432,125,361};
			gameLoop(medionNums[i]);	
		}
		
		if(level==3) {
			System.out.println("enter your guess");
			int[] hardNums= {645,348,778,295,594,365,735,224,395,448,868,952,365,432,778,695,321,424,556,479,125,761};
			gameLoop(hardNums[i]);
		}
		}
		else {
			System.out.println("     Thank You");
			break;
		}}
	}

	private static void gameLoop(int value) {
		Scanner sc= new Scanner(System.in);
		
		for(int i=1; i<100;i++) {
			int input=sc.nextInt();
		if(input<value) {
			System.out.println("your input is less then our number");
			System.out.println("Try again");
		}
		
		if(input>value) {
			System.out.println("your input is greater then our number");
			System.out.println("Try again");
		}
		if(input==value) {
			System.out.println("       "+"Congratulations you have entered right number");
			System.out.println();
			System.out.println("Your rank  is: "+ i);
			System.out.println();
			System.out.println("do you want to play game again then enter 1");
			break;
		}}
		
	}

	private static void setGameLevel() {
		Scanner sc= new Scanner(System.in);
		  System.out.println("Choose Your Game Level");
		  System.out.println("For Easy Enter 1");
		  System.out.println("For Medion Enter 2");
		  System.out.println("For Hard Enter 3");
		 
	}

	private static void gameIntro() {
		System.out.println("                   "+"WELCOME TO THE GAME"+"                    ");
		System.out.println(" In This Game We Will Gives You Unlimited Chances To Guess The Exect Number");		
	}

}
