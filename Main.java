import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Choose your operation: ");
        String operation = scanner.next();


        if(operation.equals("+")){
            System.out.println("Result = " + (number1+number2) );
        }else if(operation.equals("-")){
            System.out.println("Result = " + (number1-number2) );
        } else if (operation.equals("*")) {
            System.out.println("Result = " + (number1*number2));
        } else if (operation.equals("/")) {
            System.out.println("Result = " + (number1/number2));
        } else if (operation.equals("%")) {
            System.out.println("Result = " +(number1%number2));
        }else {
            System.out.println("Wrong operation");
        }

        System.out.println("Hello You should enter only a number 0 , 1 or 2");
        System.out.println("0 for scissors"+'\n'+"1 for rock"+'\n'+"2 for paper");
        int userIn = scanner.nextInt();
        Random rand = new Random();
        int randomIN = rand.nextInt(3);
        if(userIn == 0 && randomIN == 2){
            System.out.println("You win!! , Scissors beats paper");
        }else if(userIn == 1 && randomIN == 0){
            System.out.println("You win!! , rock beats Paper");
        } else if (userIn == 2 && randomIN == 1) {
            System.out.println("Scissors beats paper");
        }else {
            System.out.println("Try again");
        }

        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);

    }
}