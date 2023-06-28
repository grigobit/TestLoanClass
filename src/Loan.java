import java.util.Date;

/**
 * Created by grigo on 6/28/2023
 *
 * @author : grigo
 * @date : 6/28/2023
 * @projects : TestLoanClass
 */
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        this(2.5, 1, 1000);

    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public Date getLoanDate(){
        return loanDate;
    }
    public double getMonthlyPayment(){
        double montlhyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * montlhyInterestRate /
                (1 - ( 1 / Math.pow(1 + montlhyInterestRate, numberOfYears* 12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

}
