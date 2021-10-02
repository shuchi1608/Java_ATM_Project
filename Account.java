import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double currentBalance=0;
    private double savingBalance=0;

    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber()
    {
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public double getCurrentBalance()
    {
        return currentBalance;
    }

    public double getSavingBalance()
    {
        return savingBalance;
    }

    public double calCurrentWithdraw(double amount)
    {
        currentBalance=(currentBalance-amount);
        return currentBalance;
    }

    public double calSavingWithdraw(double amount)
    {
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }

    public double calCurrentDeposit(double amount)
    {
        currentBalance=(currentBalance+amount);
        return currentBalance;
    }

    public double calSavingDeposit(double amount)
    {
        savingBalance=(savingBalance+amount);
        return savingBalance;
    }

      public void getCurrentWithdrawInput(){
          System.out.println("Current Account Balance: "+moneyFormat.format(currentBalance));
          System.out.println("Amout you want to withdraw from Current Account: ");
          double amount=input.nextInt();

          if((currentBalance-amount)>=0)
          {
              calCurrentWithdraw(amount);
              System.out.println("New Current Account Balance:  "+moneyFormat.format(currentBalance));
          }
          else{
              System.out.println("Balance Cannot be Negative." + "\n");
          }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
        System.out.println("Amout you want to withdraw from Saving Account: ");
        double amount=input.nextInt();

        if((savingBalance-amount)>=0)
        {
            calSavingWithdraw(amount);
            System.out.println("New Saving Account Balance:  "+moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }

    public void getCurrentDepositInput()
    {
        System.out.println("Current Account Balance: "+moneyFormat.format(currentBalance));
        System.out.println("Amout you want to Deposit from Current Account: ");
        double amount=input.nextInt();

        if((currentBalance+amount)>=0)
        {
            calCurrentDeposit(amount);
            System.out.println("New Current Account Balance:  "+moneyFormat.format(currentBalance));
        }
        else{
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }

    public void getSavingDepositInput()
    {
        System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
        System.out.println("Amout you want to Deposit from Saving Account: ");
        double amount=input.nextInt();

        if((savingBalance+amount)>=0)
        {
           calSavingDeposit(amount);
            System.out.println("New Current Account Balance:  "+moneyFormat.format(currentBalance));
        }
        else{
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }
}



