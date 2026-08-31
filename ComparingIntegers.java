import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args){

        int number1;
        int number2;

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
        
        }
    }
