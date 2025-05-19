import java.util.Scanner;
public class MagicNumber {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 
 
 // Create the random guess number 
 int magicNumber = (int) (Math.random() * 101);
 int guessNumber = 0;
 System.out.println("Guess a magic number between 0 and 100 inclusive.");
 
 
 // While loop lets the user keep guessing multiple times until the answer is correct
 while (true) {
 
System.out.print("Enter your guess: ");
 
int userNumGuess = scanner.nextInt();
 
guessNumber++;
 
 
// If statement to determine if guess number is too high or too low
 
if (userNumGuess < magicNumber) {
 
System.out.println("Your guess is too low.");
 
System.out.println();
 
} else if (userNumGuess > magicNumber) {
 
System.out.println("Your guess is too high.");
 
System.out.println();
 
} else {
 
System.out.println("Yes. The magic number is " + magicNumber);
 
System.out.println();
 
System.out.println("It took you " + guessNumber + " guesses.");
 
break;
 
 
    }
   } 
 scanner.close();
 }
}