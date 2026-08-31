import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args){

        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        int average;

        Scanner scanner = new Scanner(System.in);

        //prompt user for first integer
        System.out.print("Enter first integer: ");
        number1 = scanner.nextInt();

        //prompt user for second integer
        System.out.print("Enter second Integer: ");
        number2 = scanner.nextInt();

        //conditional statements to compare the two integers
        if(number1 == number2) 
            System.out.printf("These numbers are equal.%n");
        
        if(number1 > number2)
            System.out.printf("%d is larger than %d.%n", number1, number2);

        if(number1 < number2)
            System.out.printf("%d is smaller than %d.%n", number1, number2);

        //prompt user for third integer
        System.out.print("Enter third integer: ");
        number3 = scanner.nextInt();

        //sum of the three integers
        sum = number1 + number2 + number3;

        //product of the three integers
        product = number1 * number2 * number3;

        //average of the three integers
        average = sum / 3;

        //display results
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Average: %d%n", average);

        }
    }
