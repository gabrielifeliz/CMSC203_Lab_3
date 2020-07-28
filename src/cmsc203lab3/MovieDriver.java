package cmsc203lab3;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		// Create Scanner object to read user input from console
		Scanner sc = new Scanner(System.in);
		
		// Create Movie object
		Movie movie = new Movie();
		
		// Declare String variables for movie title and its rating
		String movieTitle, movieRating, decision = "y";
		// Declare int variable for tickets sold for the movie
		int soldTickets;
		
		while (decision.equalsIgnoreCase("y")) {
			// Prompt the user for movie title
			System.out.println("Please enter the title of a movie: ");
			// Read what user enters as movie title
			movieTitle = sc.nextLine();
			// Set title in Movie object
			movie.setTitle(movieTitle);
			
			// Prompt the user for movie's rating
			System.out.println("Please enter the movie's rating: ");
			// Read what user enters as movie's rating
			movieRating = sc.nextLine();
			// Set rating in Movie object
			movie.setRating(movieRating);
			
			// Prompt the user for movie title
			System.out.println("Please enter the number of tickets sold for this movie: ");
			// Read what user enters as sold tickets for movie
			soldTickets = sc.nextInt();
			// Set sold tickets in Movie object
			movie.setSoldTickets(soldTickets);
			
			// Print information about movie
			System.out.println(movie);
			
			// Prompt user to decide whether he/she wants to add another movie or not
			System.out.println("Do you want to enter another movie? (y or n)");
			// Read extra newline character
			//sc.nextLine();
			// Read what user decides about entering a new movie
			decision = sc.nextLine();
			
		}
		
		// Say Goodbye to the user to let him/her know that the program has terminated
		System.out.println("Goodbye!");
		
		sc.close(); // Close Scanner object to prevent resource leak
	}

}
