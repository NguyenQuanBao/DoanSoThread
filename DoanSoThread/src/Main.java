import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đoán: ");
        int number = scanner.nextInt();

        GuessANumberThread guessANumberThread = new GuessANumberThread(number);
        GuessANumberThread guessANumberThread1 = new GuessANumberThread(number);

        guessANumberThread1.setName("Luồng 2");
        guessANumberThread.setName("Luồng 1");

        guessANumberThread.start();
        guessANumberThread1.start();
    }
}
