import java.util.Scanner;

class ATM{
    float Balance = 1245789;
    int PIN = 5674;

    public void checkPin(){
        System.out.println("Enter Your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Enter Valid PIN");
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check Balance: ");
        System.out.println("2. Withdraw: ");
        System.out.println("3. Deposite: ");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        } else if (opt==2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        } else if (opt == 4) {
            return;
        }else{
            System.out.println("Enter Valid Choice.");
        }

    }
    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Fund");
        }
        else{
            Balance = Balance-amount ;
            System.out.println("Money withdrawn successfully: ");
        }
        menu();
    }

    public void depositeMoney(){
        System.out.println("Enter amount to Deposite: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Deposited Successful");
    }
}
public class Main {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();
    }
}