import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean exit = false;
        boolean newCalculation = true;

        while (!exit) {
            if (newCalculation) {
                System.out.println("Scientific Calculator Menu:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square Root");
                System.out.println("6. Exponentiation");
                System.out.println("7. Sine");
                System.out.println("8. Cosine");
                System.out.println("9. Tangent");
                System.out.println("10. Logarithm (base 10)");
                System.out.println("11. Natural Logarithm (ln)");
                System.out.println("12. Memory Operations");
                System.out.println("13. Exit");
                System.out.print("Select an operation (1-13): ");
            } else {
                System.out.println("Result: " + result);
                System.out.print("Select an operation (1-13 or 0 for new calculation): ");
            }

            int choice = scanner.nextInt();
            double operand;

            switch (choice) {
                case 0:
                    newCalculation = true;
                    break;
                case 1:
                    System.out.print("Enter the number to add: ");
                    operand = scanner.nextDouble();
                    result += operand;
                    newCalculation = false;
                    break;
                case 2:
                    System.out.print("Enter the number to subtract: ");
                    operand = scanner.nextDouble();
                    result -= operand;
                    newCalculation = false;
                    break;
                case 3:
                    System.out.print("Enter the number to multiply by: ");
                    operand = scanner.nextDouble();
                    result *= operand;
                    newCalculation = false;
                    break;
                case 4:
                    System.out.print("Enter the number to divide by: ");
                    operand = scanner.nextDouble();
                    if (operand != 0) {
                        result /= operand;
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    newCalculation = false;
                    break;
                case 5:
                    result = Math.sqrt(result);
                    newCalculation = false;
                    break;
                case 6:
                    System.out.print("Enter the exponent: ");
                    operand = scanner.nextDouble();
                    result = Math.pow(result, operand);
                    newCalculation = false;
                    break;
                case 7:
                    result = Math.sin(result);
                    newCalculation = false;
                    break;
                case 8:
                    result = Math.cos(result);
                    newCalculation = false;
                    break;
                case 9:
                    result = Math.tan(result);
                    newCalculation = false;
                    break;
                case 10:
                    if (result > 0) {
                        result = Math.log10(result);
                    } else {
                        System.out.println("Error: Invalid input for logarithm.");
                    }
                    newCalculation = false;
                    break;
                case 11:
                    if (result > 0) {
                        result = Math.log(result);
                    } else {
                        System.out.println("Error: Invalid input for natural logarithm.");
                    }
                    newCalculation = false;
                    break;
                case 12:
                    System.out.println("Memory Menu:");
                    System.out.println("1. Store result in memory");
                    System.out.println("2. Recall memory");
                    System.out.println("3. Clear memory");
                    System.out.print("Select a memory operation (1-3): ");
                    int memoryChoice = scanner.nextInt();
                    switch (memoryChoice) {
                        case 1:
                            memory = result;
                            break;
                        case 2:
                            result = memory;
                            break;
                        case 3:
                            memory = 0;
                            break;
                        default:
                            System.out.println("Invalid memory operation.");
                            break;
                    }
                    break;
                case 13:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        System.out.println("Calculator closed.");
    }
}