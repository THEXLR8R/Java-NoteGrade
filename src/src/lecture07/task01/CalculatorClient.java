package lecture07.task01;

import java.util.Scanner;

public class CalculatorClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        while (inputIsNotFinished(inputLine)) {
            String outputLine = processCommand(inputLine);
            System.out.println(outputLine);
            inputLine = scanner.nextLine();
        }
    }

    static String processCommand(String line) {

        String[] linePortions = line.split(" ");

        String command = linePortions[0].toUpperCase();
        double a = Double.parseDouble(linePortions[1]);
        double b = Double.parseDouble(linePortions[2]);

        double result;

        switch (command) {
            case "SUM":
                result = Calculator.sum(a, b);
                break;
            case "SUB":
                result = Calculator.subtract(a, b);
                break;
            case "MUL":
                result = Calculator.multiply(a, b);
                break;
            case "DIV":
                result = Calculator.divide(a, b);
                break;
            case "PER":
                result = Calculator.percentage(a, b);
                break;
            default:
                return "ERROR!";
        }

        return String.format("%.3f", result);
    }

    static boolean inputIsNotFinished(String line) {
        return !line.equalsIgnoreCase("END");
    }

}
