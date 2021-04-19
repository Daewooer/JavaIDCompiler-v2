import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Hi there");
		System.out.println("Type you're name:");
		
		String MyName1 = myObj.nextLine();
		
		System.out.println("Great you're name is " + MyName1);
		//name section is done 
		
		System.out.println("What is you're username?");
		String MyUsername = myObj.nextLine();
		System.out.println("Nice, you're username is " + MyUsername);
		//username section done
		
		System.out.println("What is you're age?");
		String MyAge = myObj.nextLine();
		System.out.println("Alright, you're age is " + MyAge);
		//age section done
		
		System.out.println("What is you're sex?");
		String MySex = myObj.nextLine();
		System.out.println("Nice, you're username is " + MySex);
		//sex section done 
		
		System.out.println("You're id is ready");
		
		System.out.println("Name: " + MyName1  );
		System.out.println("Username: " + MyUsername );
		System.out.println("Age: " + MyAge );
		System.out.println("Sex: " + MySex );
	}

}
