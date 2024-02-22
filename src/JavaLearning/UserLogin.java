package JavaLearning;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String _username="Radwan";
        String _password="1234";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input username");
        String username=scanner.next();
        System.out.println("Please input password");
        String password=scanner.next();
        if(_username.contentEquals(username) && _password.contentEquals(password)){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login failed");
        }
    }
}
