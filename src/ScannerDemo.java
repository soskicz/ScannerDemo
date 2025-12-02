import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean InputOK;
        int firstNumber = 0;
        int secondNumber = 0;

        do
        {
            System.out.println("Enter the first number: ");
            String strFirstNumber = sc.nextLine();
            try
            {
                firstNumber = Integer.parseInt(strFirstNumber);
                InputOK = true;
            }
            catch (Exception e)
            {
                System.out.println("Please repeat the input");
                InputOK = false;
            }
        } while (!InputOK);

        do
        {
            System.out.println("Enter the second number: ");
            String strSecondNumber = sc.nextLine();
            try
            {
                secondNumber = Integer.parseInt(strSecondNumber);
                InputOK = true;
            }
            catch (Exception e)
            {
                System.out.println("Please repeat the input");
                InputOK = false;
            }
        } while (!InputOK);

        int result = firstNumber + secondNumber;
        System.out.println("The result is: "+ result);
    }
}