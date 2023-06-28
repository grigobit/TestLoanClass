import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, e.g. 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter the number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount, e.g. 120000.95: ");
        double lonaAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, lonaAmount);

        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}