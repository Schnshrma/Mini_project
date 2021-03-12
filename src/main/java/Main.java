import java.util.Scanner;

public class Main {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    static double square_root(double n)
    {
        return Math.sqrt(n);
    }
    static double log(double n)
    {
        return Math.log(n);
    }
    static double power(double firstA,double firstB)
    {
       return Math.pow(firstA,firstB);
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
            System.out.print("Enter the operation Serial number :\n1.sqrt \n2.fact \n3.log \n4.pow\n5.exit\n");
            int operator = reader.nextInt();

            double result;

            switch (operator) {
                case 1:
                    System.out.print("Enter the number for square root : ");
                    double first = reader.nextDouble();
                    result = square_root(first);
                    System.out.println(" \n\n\n\nSquare root of " + first + " = " + result+"\n\n\n\n");
                    break;

                case 2:
                    System.out.print("Enter the number for factorial : ");
                    int first1 = reader.nextInt();
                    result = factorial(first1);
                    System.out.println(" \n\n\n\nFactorial of " + first1 + " = " + result+"\n\n\n\n");
                    break;

                case 3:
                    System.out.print("Enter the number for Log : ");
                    double first2 = reader.nextDouble();
                    result = log(first2);
                    System.out.println(" \n\n\n\nLog of " + first2 + " = " + result+"\n\n\n\n");
                    break;

                case 4:
                    System.out.print("Enter number for A^B : \n");
                    System.out.print("Enter A : ");
                    double firstA = reader.nextDouble();
                    System.out.print("Enter B : ");
                    double firstB = reader.nextDouble();
                    result = power(firstA, firstB);
                    System.out.println("\n\n\n\n" + firstA + " ^ " + firstB + " = " + result+"\n\n\n\n");
                    break;
                case 5:
                    System.out.println("\n\n\n\nThank-You..!!\n\n\n\n");
                    return;
                default:
                    System.out.println("\n\n\n\nError! operator is not correct ..!! \n Try again ..!!\n\n\n\n");
            }

        }

    }
}

