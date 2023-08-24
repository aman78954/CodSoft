
package Atm;

public class Atmopertaionimpl implements AtmOperationInterf{
    atm atm1 = new atm();
    
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm1.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0) {
            if (withdrawAmount <= atm1.getBalance()) {
                
                System.out.println("Collect the Cash " + withdrawAmount);
                atm1.setBalance(atm1.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance !!");
            }
        }
        else {
            System.out.println("Please enter the amount in multipal of 500");
        }

    }

    @Override
    public void depositAmount(double depositAmount) {
       
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm1.setBalance(atm1.getBalance()+depositAmount);
        viewBalance();

    }
        

    }
