package pl.globallogic.lessons;

import java.util.Objects;
import java.util.Scanner;

public class inputUser {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input your full name: ");
//        String userName = scanner.nextLine();
//        if(Objects.equals(userName, "Maja")){
//            System.out.println("What's up " + userName);
//        }
//        else{
//            System.out.println("Hello, " + userName);
//        }
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your full name: ");
        String userName = scanner.nextLine();

        switch (userName) {
            case "Maja":
                System.out.println("What's up " + userName);

            default:
                System.out.println("Hello, " + userName);
        }
    }

}
