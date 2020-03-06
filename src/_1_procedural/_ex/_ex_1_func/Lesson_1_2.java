package _1_procedural._ex._ex_1_func;
import java.util.Scanner;

/**      Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
*        Если они отличаются лишь регистром - "Хорошо. Почти одинаковы".
*        Если они отличаются, но одной длины - "Ну, хотя бы они одной длины".
*/

public class Lesson_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  firstString = scanner.nextLine();
        String  secondString = scanner.nextLine();

        if(firstString.equals(secondString)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if(firstString.equalsIgnoreCase(secondString)){
            System.out.println("Хорошо. Почти одинаковы");
        } else if(firstString.length() == secondString.length()){
            System.out.println("Ну, хотя бы они одной длины");
        } else {
            System.out.println("Строки ни чем не похожи");
        }
    }
}
