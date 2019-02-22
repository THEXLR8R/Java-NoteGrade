package lecture07.task03.bank;

import lecture07.task03.Credentials;

public class Account {
    final String name;
    final String govId;
    final Credentials credentials;

    double balance;

    Account(String name, String govId, String username, String password) {
        this.name = name;
        this.govId = govId;
        this.credentials = new Credentials(username, password);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    boolean hasAccess(String password) {
        return credentials.passwordMatches(password);
    }

    double getBalance() {
        return balance;
    }

    String getUsername() {
        return credentials.username;
    }

    String getName() {
        return name;
    }

    String getGovId() {
        return govId;
    }


}
