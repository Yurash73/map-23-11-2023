package Task_4;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {

        Map<String, String> fruits = new HashMap<>();

        fruits.put("арбуз", "ягода");
        fruits.put("банан", "трава");
        fruits.put("вишня", "ягода");
        fruits.put("груша", "фрукт");
        fruits.put("дыня", "овощ");
        fruits.put("ежевика", "куст");
        fruits.put("жень-шень", "корень");
        fruits.put("земляника", "ягода");
        fruits.put("ирис", "цветок");
        fruits.put("картофель", "клубень");

        fruits.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
