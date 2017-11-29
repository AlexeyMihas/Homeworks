import java.util.Scanner;

public class Round {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, которое округляем: ");
        double z = scanner.nextDouble();
        System.out.println("Вы ввели: " + z + " я его округлил и получилось: " + (int)Math.round(z));
    }
}