
import java.util.Scanner;
public class Question1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cont1 = "yes";
        while (cont1.equals("yes")) {
            System.out.println("Enter the quantity purchased.");
            double amount = input.nextDouble();
            System.out.println("Enter the unit price.");
            double unitPrice = input.nextDouble();
            double total;
            if (amount>120) {
                total = amount*unitPrice*0.85;
            }
            else if (amount<100) {
                total = amount*unitPrice;
            }
            else {
                total = amount*unitPrice*0.9;
            }
            System.out.println("Total price is £"+total);
            System.out.println();
            do {
                System.out.println("Do you wish to continue, yes or no?");
                String cont = input.nextLine();
                cont1 = cont.toLowerCase();
            } while(!cont1.equals("yes") && !cont1.equals("no"));
            
        }
    }

}
