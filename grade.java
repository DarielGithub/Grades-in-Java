import java.util.Scanner;

public class grade {
	public static void loop() {
		System.out.println("Try Again?");
		System.out.println("If Yes type [Y], if No type [N]");
  }
  public static void closing() {
	  System.out.println("The Program is Closed");
  }
  public static void clearScreen(){
		System.out.print("\033[H\033[2J"); 
		System.out.flush();
  }
  public static void printLang() {
	  System.out.println("================================");
  }

  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  
	  char loop = 'Y';
	  
	  do {
	  printLang();
	  System.out.println("\tGrading System");
	  printLang();
	  
	  System.out.println("Input your Grades");
	  
	  System.out.print("English: ");
	  int eng = s.nextInt();
	  
	  System.out.print("Math: ");
	  int math = s.nextInt();
	  
	  System.out.print("Science: ");
	  int sci = s.nextInt();
	  
	  System.out.print("Computer: ");
	  int comp = s.nextInt();
	  
	  int total = (eng + math + sci + comp)/4;
	  
	  printLang();
	  System.out.println("Average: " + total);
	  
	  if(total >= 98 && total <= 100) {
		  System.out.println("With Highest Honors");
	  }
	  else if(total >= 95 && total <= 97.99) {
		  System.out.println("With High Honors");
	  }
	  else if(total >= 90 && total <= 94.99) {
		  System.out.println("With Honors");
	  }
	  else if(total >= 75 && total <= 89.99) {
		  System.out.println("Passed");
	  }
	  else if(total <= 75) {
		  System.out.println("Failed");
	  }
	  else if(total > 100){
		  System.out.println("Invalid Grade");
	  }
	  else {
		  System.out.println("Please Enter your Grade");
	  }
	  printLang();
	  loop();
	  System.out.print("Enter: ");
	  loop = s.next().charAt(0);   
	  clearScreen();
	 
  }while(loop == 'Y' || loop == 'y');
  	closing();
	
  }

}
