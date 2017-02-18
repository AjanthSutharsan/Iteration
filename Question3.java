
import java.util.Scanner;
public class Question3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter the number of iterations of the time tables required");
        int iteration = input.nextInt();
        for (int i=1; i<=iteration; i++) {
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }


}
