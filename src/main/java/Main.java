import java.util.Scanner;

public class Main {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Hello ..!");
        System.out.println("MINI PROJECT - CALCULATOR..!");
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("WELCOME..!");
            System.out.print("Enter the operation Serial number :\n1.sqrt \n2.fact \n3.log \n4.pow\n5.exit");
            int operator = reader.nextInt();

            double result;

            switch (operator) {
                case 1:
                    System.out.print("Enter the number for square root : ");
                    double first = reader.nextDouble();
                    result = Math.sqrt(first);
                    System.out.println(" Square root of " + first + " = " + result);
                    break;

                case 2:
                    System.out.print("Enter the number for factorial : ");
                    int first1 = reader.nextInt();
                    result = factorial(first1);
                    System.out.println(" Factorial of " + first1 + " = " + result);
                    break;

                case 3:
                    System.out.print("Enter the number for Log : ");
                    double first2 = reader.nextDouble();
                    result = Math.log(first2);
                    System.out.println(" Log of " + first2 + " = " + result);
                    break;

                case 4:
                    System.out.print("Enter number for A^B : \n");
                    System.out.print("Enter A : ");
                    double firstA = reader.nextDouble();
                    System.out.print("Enter B : ");
                    double firstB = reader.nextDouble();
                    result = Math.pow(firstA, firstB);
                    System.out.println("\n " + firstA + " ^ " + firstB + " = " + result);
                    break;
                case 5:
                    System.out.println("Thank-You..!!");
                    return;
                default:
                    System.out.println("Error! operator is not correct");
            }

        }

    }
}

