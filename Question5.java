
import java.util.Scanner;
public class Question5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        int root = 1;
        do {
            int square = root*root;
            if (square<=100) {
                System.out.print(square+" ");
                root += 1;
            }
            else {
                cont = false;
            }
        } while (cont == true);
        System.out.println();
    }
}
