package Loan;

public class SecondTierBank {
    private final int FIXEDBANKREWARD = 2;
    private Calculator calc = new Calculator();

    public SecondTierBank(){}

    public int calculateDeposit(int amountOfDeposit,int termOfDeposit,String typeOfCustomer){
        return calc.depositReward(amountOfDeposit, termOfDeposit, typeOfCustomer) * FIXEDBANKREWARD;
    }

}
