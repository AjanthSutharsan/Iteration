
import java.util.Scanner;
public class Question4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of iterations of the Fibonnaci Sequence required");
        int iteration = input.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        if (iteration<3) {
            switch (iteration) {
                case 1: System.out.println("The sequence is: "+a);
                break;
                case 2: System.out.println("The sequence is: "+a+", "+b);
                break;
            }
        }
        else {
            System.out.print("The sequence is: "+a+", "+b);
            for (int i=3; i<=iteration; i++) {
                c = a + b;
                System.out.print(", "+c);
                a = b;
                b = c;
            }
            System.out.println();
        }
    }


}
