package lecture07.task03;

public class Credentials {
    final String[] oldPasswords;
    public final String username;
    int oldPasswordCount;
    String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
        oldPasswordCount = 0;
        oldPasswords = new String[100];
    }

    public boolean passwordMatches(String passwordGuess) {
        return password.equals(passwordGuess);
    }

    boolean tryChangePassword(String passwordGuess, String newPassword) {

        if (!passwordMatches(passwordGuess)) {
            return false;
        }

        if (passwordMatches(newPassword)) {
            return false;
        }

        for (int i = 0; i < oldPasswordCount; i++) {
            if (oldPasswords[i].equals(newPassword)) {
                return false;
            }
        }

        oldPasswords[oldPasswordCount] = password;
        oldPasswordCount++;
        password = newPassword;

        return true;
    }


}
