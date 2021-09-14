/*
Pooja would like to withdraw X $US from an ATM.
The cash machine will only accept the transaction if X is a multiple of 5,
and Pooja's account balance has enough cash to perform the withdrawal transaction
(including bank charges).
For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.
 */

public class ATM {
    public static void main(String[] args) {

        double amt_to_withdraw = 20, acc_balance = 1000;
        if(amt_to_withdraw>0 && amt_to_withdraw<=2000 && amt_to_withdraw%5==0 && acc_balance>0 && amt_to_withdraw +.5<acc_balance)
        {
            acc_balance = acc_balance - amt_to_withdraw+.5;
        }

            System.out.println("Balance : "+acc_balance);

    }
}
