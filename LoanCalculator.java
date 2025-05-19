import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of years for the loan: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", 
        loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
        
        input.close();
    }
}