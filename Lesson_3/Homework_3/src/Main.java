import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        while (choice != 0) {
            userInput.getUserData();
            userInput.writeToFile();

            System.out.println("Хотите продолжить работу в программе?");
            System.out.println("1 - Продолжить");
            System.out.println("0 - Выход");

            choice = scanner.nextInt();
            scanner.nextLine(); // Считывание символа новой строки после ввода числа
        }
    }
}