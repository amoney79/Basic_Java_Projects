import java.util.*;// application that displays the numbers 1 to 4 on the same line
public class Arithmetic {

    public static void main (String[] args) {

        int number1;
        int number2;
        int sum;
        int product;
        int difference;
        int division;
        int remainder;

        //scanner object
        Scanner input = new Scanner(System.in);

        //prompt user for first integer
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        //prompt user for second integer
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        //calculate sum
        sum = number1 + number2;

        //calculate product
        product = number1 * number2;

        //calculate difference
        difference = number1 - number2;

        //calculate division
        division = number1 / number2;

        //calculate remainder
        remainder = number1 % number2;

        //display results
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Division is %d%n", division);
        System.out.printf("Remainder is %d%n", remainder);

    }
}