package lecture07.task03;

import lecture07.task03.bank.Bank;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {

        Bank bank = new Bank(5);

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        while (inputIsNotFinished(inputLine)) {
            String outputLine = processCommand(inputLine, bank);
            System.out.println(outputLine);
            inputLine = scanner.nextLine();
        }

        System.out.println(bank.getAllAccountsInfo());
    }

    static String processCommand(String line, Bank bank) {

        String[] linePortions = line.split(" ");

        String command = linePortions[0].toUpperCase();
        String username = linePortions[1];

        String password;
        double amount;
        boolean commandOutcome;

        switch (command) {
            case "OPEN":
                password = linePortions[2];
                String name = linePortions[3];
                String govId = linePortions[4];
                commandOutcome = bank.openAccount(name, govId, username, password);
                break;
            case "CLOSE":
                password = linePortions[2];
                commandOutcome = bank.closeAccount(username, password);
                break;
            case "DEPOSIT":
                amount = Double.parseDouble(linePortions[2]);
                commandOutcome = bank.deposit(username, amount);
                break;
            case "TRANSFER":
                password = linePortions[2];
                amount = Double.parseDouble(linePortions[3]);
                String recipient = linePortions[4];
                commandOutcome = bank.transfer(username, password, amount, recipient);
                break;
            case "WITHDRAW":
                password = linePortions[2];
                amount = Double.parseDouble(linePortions[3]);
                commandOutcome = bank.withdraw(username, password, amount);
                break;
            default:
                return "ERROR!";
        }

        String commandOutcomeString;
        if (commandOutcome) {
            commandOutcomeString = "success";
        } else {
            commandOutcomeString = "fail";
        }

        return String.format("%s %s", command, commandOutcomeString);
    }

    static boolean inputIsNotFinished(String line) {
        return !line.equalsIgnoreCase("END");
    }


}
