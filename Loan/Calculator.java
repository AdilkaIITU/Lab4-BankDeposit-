package Loan;

public class Calculator {
    private final int RATEFORLEGALENTITIES = 8;
    private final int RATEFORINDIVIDUALS  = 10;

    public int depositReward(int amountOfDeposit, int termOfDeposit, String typeOfCustomer){
        if ( typeOfCustomer.equals( "individual" )){
            return amountOfDeposit + amountOfDeposit * RATEFORINDIVIDUALS  * termOfDeposit/12;
        }else if ( typeOfCustomer.equals( "legalEntity" ) ){
            return amountOfDeposit + amountOfDeposit * RATEFORLEGALENTITIES * termOfDeposit/12;
        }else {
            System.out.println( "error!" );
            return 0;
        }
    }
}
