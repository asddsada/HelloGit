import java.util.Scanner;

public class Main {
	
	protected static void greeting(String name) {
		System.out.println("Hello, Git");
		System.out.println("I am "+name);
	}
	
	//fjdjflsdjfd

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		greeting(name);
		
		Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
		
		System.out.println("Aera of rectangle is "+r.getArea());
		
		

	}

}
