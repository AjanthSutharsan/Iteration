
import java.util.Scanner;
public class Question2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean correct = false;
        int attempt = 0;
        int number = (int)Math.ceil(Math.random()*101);
        do{
            System.out.println("Enter a number between 0 and 100 inclusive"); 
            int userNumber = input.nextInt();
            if (userNumber>number) {
                System.out.println("Too high - try again");
            }
            else if (userNumber<number) {
                System.out.println("Too low - try again");
            }
            else {
                System.out.println("Correct - well done");
                correct = true;
            }
            attempt += 1;
        } while(correct==false);
        System.out.println(attempt + " attempt(s) were required.");
    }
}
