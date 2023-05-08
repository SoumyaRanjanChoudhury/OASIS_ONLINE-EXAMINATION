package oasis;
import java.util.Scanner;
public class OnlineExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);
		    
		    // Login
		    System.out.print("Enter your username: ");
		    String username = scanner.nextLine();
		    System.out.print("Enter your password: ");
		    String password = scanner.nextLine();
		    
		    // Check if the login credentials are valid
		    if (isValidLogin(username, password)) {
		    
		      // Update profile and password
		      System.out.print("Do you want to update your profile and password? (Y/N): ");
		      String choice = scanner.nextLine();
		      
		      if (choice.equalsIgnoreCase("Y")) {
		        updateProfile();
		        updatePassword();
		      }
		      
		      // Selecting answers for MCQs
		      selectAnswers();
		      
		      // Timer and auto submit
		      startTimer();
		      autoSubmit();
		      
		      // Closing session and logout
		      closeSession();
		      logout();
		      
		    } else {
		    	 System.out.println("Invalid login credentials. Please try again.");
		    }
		    
		    scanner.close();
		  }
		  
		  private static boolean isValidLogin(String username, String password) {
		    // Check if the login credentials are valid and return true or false accordingly
			  return true;
		  }
		  
		  private static void updateProfile() {
		    // Code to update user profile
		  }
		  
		  private static void updatePassword() {
		    // Code to update user password
		  }
		  
		  private static void selectAnswers() {
		    // Code to display the MCQs and allow the user to select answers
		  }
		  
		  private static void startTimer() {
		    // Code to start the timer
		  }
		  
		  private static void autoSubmit() {
		    // Code to submit the answers automatically when the timer runs out
		  }
		  
		  private static void closeSession() {
			  // Code to close the session and display the user's score
		  }
		  
		  private static void logout() {

		    }


	}
