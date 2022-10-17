package ch11;

public class PasswordTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) {
            throw new PasswordException("password not null");
        } else if (password.length() < 5) {
            throw new PasswordException("password more than 5");
        } else if(password.matches("[a-zA-Z]+")) {
            throw new PasswordException("password include num");
        }
        this.password = password;
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();

        String password = null;
        try {
            test.setPassword(password);
            System.out.println("no error");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
