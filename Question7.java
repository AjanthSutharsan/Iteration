
import java.util.Scanner;
public class Question7
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What can occur if the result of a calculation is too small to store in the memory of a computer? Overflow, underflow, process starvation, or data congestion?");
        String answer = input.nextLine();
        String answer1 = answer.toLowerCase();
        while (!answer1.equals("underflow")) {
            System.out.println("Unfortunately, "+answer1+" is incorrect - try again.");
            System.out.println("What can occur if the result of a calculation is too small to store in the memory of a computer? Overflow, underflow, process starvation, or data congestion?");
            answer = input.nextLine();
            answer1 = answer.toLowerCase();
        }
        System.out.println("Well done - undeflow is correct");
    }


}
