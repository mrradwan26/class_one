package JavaLearning;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner refat = new Scanner(System.in);
        String var = refat.next();
        int asciiValue = (int) var.charAt(0);
        if (asciiValue >= 65 && asciiValue <= 91) {
            System.out.println("This is capital letter");
        } else {
            System.out.println("This is small letter");
        }

    }
}