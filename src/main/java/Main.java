import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public int fact(int n) {
        if (n == 0)
            return 1;
        else {
            return (n * fact(n - 1));
            }
    }
    public int factorial(int number1) {
        logger.info("[FACTORIAL] - " + number1);
        int result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }
    public double square_root(double n)
    {
        logger.info("[SQ ROOT] - " + n);
        double result = Math.sqrt(n);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
    public double log(double number1)
    {
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public double power(double firstA,double firstB)
    {
        logger.info("[POWER - " + firstA + " RAISED TO] " + firstB);
       double result= Math.pow(firstA,firstB);
        logger.info("[RESULT - POWER] - " + result);
       return result;
    }
    public static void main(String[] args) {
        Main ob=new Main();
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
                    result = ob.square_root(first);
                    System.out.println(" \n\n\n\nSquare root of " + first + " = " + result+"\n\n\n\n");
                    break;

                case 2:
                    System.out.print("Enter the number for factorial : ");
                    int first1 = reader.nextInt();
                    result = ob.factorial(first1);
                    System.out.println(" \n\n\n\nFactorial of " + first1 + " = " + result+"\n\n\n\n");
                    break;

                case 3:
                    System.out.print("Enter the number for Log : ");
                    double first2 = reader.nextDouble();
                    result = ob.log(first2);
                    System.out.println(" \n\n\n\nLog of " + first2 + " = " + result+"\n\n\n\n");
                    break;

                case 4:
                    System.out.print("Enter number for A^B : \n");
                    System.out.print("Enter A : ");
                    double firstA = reader.nextDouble();
                    System.out.print("Enter B : ");
                    double firstB = reader.nextDouble();
                    result = ob.power(firstA, firstB);
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

