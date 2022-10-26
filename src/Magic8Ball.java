import java.util.Scanner;

public class Magic8Ball {
    public static void main (String[]args) {
      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";
        int number = (int)(Math.random() * 6) + 1;
        if (number == 1) {
            response = "Signs point to yes.";
        } else if (number == 2) {
            response = "My sources say no.";
        } else if (number == 3) {
            response = "Reply hazy, try again.";
        } else if (number == 4) {
            response = "It is decidedly so.";
        } else if (number == 5) {
            response = "Don't count on it.";
        } else if (number == 6) {
            response = "Cannot predict now.";
        }

        if (number == 1) {
            response = "Signs point to yes.";
        }

        if (number == 2) {
            response = "My sources say no.";
        }

        if (number == 3) {
            response = "Reply hazy, try again.";
        }

        if (number == 4) {
            response = "It is decidedly so.";
        }

        if (number == 5) {
            response = "Don't count on it.";
        }

        if (number == 6) {
            response = "Cannot predict now.";
        }

        System.out.println(response);
       */

        SelectionMadness madness = new SelectionMadness();

        // test flipcoin -- these will return true or false randomly
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());

        // test largest
        System.out.println(madness.largest(5, 8, 3));
        System.out.println(madness.largest(8, 5, 3));
        System.out.println(madness.largest(3, 5, 8));
        System.out.println(madness.largest(-5, -8, -3));
        System.out.println(madness.largest(11, 11, 10));

        // test rightTriangle
        System.out.println(madness.rightTriangle(3, 4, 5));
        System.out.println(madness.rightTriangle(5, 4, 3));
        System.out.println(madness.rightTriangle(6, 8, 10));
        System.out.println(madness.rightTriangle(8, 10, 6));
        System.out.println(madness.rightTriangle(3, 6, 5));
        System.out.println(madness.rightTriangle(1, 2, 3));

    }
}
