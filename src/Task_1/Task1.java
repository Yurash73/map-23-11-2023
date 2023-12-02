package Task_1;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

        HashMap<String, String> surnamesNames = new HashMap<>();
        surnamesNames.put("Иванов", "Иван");
        surnamesNames.put("Петров", "Петр");
        surnamesNames.put("Смирнов", "Алексей");
        surnamesNames.put("Кузнецов", "Иван");
        surnamesNames.put("Иванов", "Петр");
        surnamesNames.put("Сидоров", "Евгений");
        surnamesNames.put("Распутин", "Григорий");
        surnamesNames.put("Романов", "Николай");
        surnamesNames.put("Джугашвили", "Иосиф");
        surnamesNames.put("Кузнецов", "Сергей");

        surnamesNames.forEach((k, v) -> System.out.println("Фамилия - " + k +
                " имя - " + v));

    }
}
