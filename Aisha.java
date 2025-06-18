import java.util.Scanner;

public class Aisha {
    public static void main(String[] args) {
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter to add \n press 0 to exit");
        System.out.println("enter an integer number :");
        int number= input.nextInt();
        while (true) {
            System.out.print("Enter an integer number: ");
            String character = input.next();

            if (character.equalsIgnoreCase("n")) {
                sum += number;
        System.out.println("the sum of the number are: " + sum);
                break;
            }
            else {
                System.out.println("invalid number");
            }
        }

    }
}
