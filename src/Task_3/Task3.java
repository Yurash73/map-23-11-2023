package Task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Map<String, String> findCities = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название города и фамилию семьи, которая в нем живет. " +
                " Для окончания ввода введите пустой город. \n");
        while (true) {
            System.out.println("Введите название города ( или Enter для окончания ввода) : ");
            String city = scanner.nextLine().trim();
            if (city.isEmpty())
                break;
            System.out.println("Введите фамилию семьи: ");
            String family = scanner.nextLine();
            findCities.put(city, family);
        }
        System.out.println("А теперь займемся поиском.");

        while (true) {
            System.out.println("Введите название города: ");
            String city = scanner.nextLine().trim();
            if (city.isEmpty())
                break;
            if (findCities.containsKey(city)) {
                System.out.println(" В городе " + city + " проживает семья " +
                        findCities.get(city));
            }
        }

    }
}
