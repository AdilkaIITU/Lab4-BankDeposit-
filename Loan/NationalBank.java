package Loan;

public class NationalBank {
    private final int FIXEDBANKREWARD = 1;
    private Calculator calc = new Calculator();

    public NationalBank(){}

    public int calculateDeposit(int amountOfDeposit, int termOfDeposit, String typeOfCustomer){
        return calc.depositReward(amountOfDeposit, termOfDeposit, typeOfCustomer) * FIXEDBANKREWARD;
    }

}
