package lecture07.task03.bank;

public class Bank {
    final Account[] database;

    int currentAccountCount;
    double assets;

    public Bank(int maxAccountCount) {
        this.database = new Account[maxAccountCount];
    }

    public boolean openAccount(String name, String govId, String username, String password) {

        if (currentAccountCount == database.length) {
            // ERROR
            return false;
        }

        database[currentAccountCount] = new Account(name, govId, username, password);
        currentAccountCount++;
        return true;
    }

    public boolean closeAccount(String username, String password) {

        Account account = findAccount(username);

        if (account == null) {
            return false;
        }

        if (account.hasAccess(password)) {
            removeAccount(account);
            return true;
        }

        return false;
    }

    public boolean deposit(String username, double amount) {

        if (amount < 0) {
            // ERROR
            return false;
        }

        Account account = findAccount(username);

        if (account == null) {
            return false;
        }

        assets += amount;
        account.deposit(amount);

        return true;
    }

    public boolean withdraw(String username, String password, double amount) {

        if (amount < 0) {
            return false;
        }

        Account account = findAccount(username);

        if (account == null || !account.hasAccess(password)) {
            return false;
        }

        if (amount > account.getBalance()) {
            return false;
        }

        assets -= amount;
        account.withdraw(amount);

        return true;
    }

    public boolean transfer(String username, String password, double amount, String recipientUsername) {
        boolean successfulWithdraw = withdraw(username, password, amount);

        if (!successfulWithdraw) {
            return false;
        }

        return deposit(recipientUsername, amount);
    }

    public String getAllAccountsInfo() {

        String info = String.format("%.2f%n", getAssets());

        for (int i = 0; i < currentAccountCount; i++) {
            info += String.format("%s, %s, %.2f%n",
                    database[i].getName(), database[i].getGovId(), database[i].getBalance());
        }

        return info;
    }

    double getAssets() {
        return assets;
    }

    Account findAccount(String username) {

        for (int i = 0; i < currentAccountCount; i++) {
            if (database[i].getUsername().equalsIgnoreCase(username)) {
                return database[i];
            }
        }

        return null;
    }

    void removeAccount(Account account) {

        for (int i = 0; i < currentAccountCount; i++) {

            if (database[i] == account) {
                for (int j = i + 1; j < currentAccountCount; j++) {
                    database[i] = database[j];
                }

                currentAccountCount--;
                return;
            }
        }
    }


}
