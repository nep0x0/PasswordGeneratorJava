package studi.kasus.java.application;
import java.util.Random;

public class PasswordGeneratorApp {

    public static String password = "";
    public static String input = "";
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowPassword();
    }

    public static void showPassword(){
        System.out.println("PASSWORD GENERATOR");
    }


    public static String shuffle(int inputLenght){
        Random random = new Random();

        final String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (var i = 0; i < inputLenght; i++) {
            int index = random.nextInt(chars.length());
            char temp = chars.charAt(index);
            password += temp;
        }
        return password;
    }

    public static void testSuffle(){
        shuffle(7);
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();

        return data;
    }

    public static void testInput(){
        var name = input("Panjang Password");
        System.out.println(name);
    }

    public static void viewShowPassword(){
        while (true){
            showPassword();
            System.out.println("x. Exit");

            input = input("Password Length");

            if (input.equals("x") || input.equals("X")) {
                break;
            } else {
                System.out.println(shuffle(Integer.parseInt(input)));
            }

        }
    }



}
