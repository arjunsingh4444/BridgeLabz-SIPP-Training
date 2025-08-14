package BridgeLabz_SIPP_Training.Exception;
import java.util.Scanner;

public class EmployeeServiceimpl  implements iempoly {

    public String login(String name, String passward){
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        String inputPassward = sc.nextLine();
        if(name.equals(inputName) && passward.equals(inputPassward)) {
            return "Login Successful";
        } else {
            throw new usernotFoundexception("User not found with name: " + name);
        }
    }
    public static void main(String[] args) {
        
        EmployeeServiceimpl service = new EmployeeServiceimpl();
        try {
            String result = service.login("Arjun singh", "12345674");
            System.out.println(result);
        } catch (usernotFoundexception e) {
            System.out.println(e.getMessage());
        }
    }
}