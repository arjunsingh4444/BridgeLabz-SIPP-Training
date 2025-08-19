package BridgeLabz_SIPP_Training.practice_problems;
public class login implements Authenticatable {
    private String email;
    private String password;

    // Constructor
    public login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    // Implement authenticate method (stubbed logic)
    @Override
    public boolean authenticate(String emailInput, String passwordInput) {
        return this.email.equals(emailInput) && this.password.equals(passwordInput);
    }

    @Override
    public String toString() {
        return "Login{email='" + email + "'}";
    }
}
