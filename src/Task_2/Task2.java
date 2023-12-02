package Task_2;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> months = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        while (true) {
            System.out.println("Введите названия месяца на английском языке: ");
            System.out.println(" January, February etc.");
            String buffer = scanner.nextLine().trim();
            if (months.containsKey(buffer)) {
                System.out.println(buffer + " is the " + months.get(buffer) + " month");
            } else System.out.println("Неправильн ввели название месяца!!");
            System.out.println();
        }

    }
}
