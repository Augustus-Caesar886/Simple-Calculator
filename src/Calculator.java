import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a sign(+, -, *, /): ");
            char sign = (uInput.next()).charAt(0);
            System.out.print("How many integers? ");
            int total = uInput.nextInt();
            int[] allNumbers = new int[total];
            for(int i = 0; i < allNumbers.length; i++) {
                System.out.print("Integer " + (i+1) +": ");
                allNumbers[i] = uInput.nextInt();
            }
            int result = 0;
            switch(sign) {
                case '+':
                    for(int i = 0; i < allNumbers.length; i++) {
                        result += allNumbers[i];
                    }
                    break;
                case '-':
                    result = allNumbers[0];
                    for(int i = 1; i < allNumbers.length; i++) {
                        result -= allNumbers[i];
                    }
                    break;
                case '*':
                    result = 1;
                    for(int i = 0; i < allNumbers.length; i++) {
                        result *= allNumbers[i];
                    }
                    break;
                case '/':
                    result = allNumbers[0];
                    for(int i = 1; i < allNumbers.length; i++) {
                        result /= allNumbers[i];
                    }
                    break;
                default:
                    System.out.println("You did not give a valid operator!\n");
                    continue;
            }
            System.out.println("Output: " + result);
            System.out.println();
        }
    }
}
