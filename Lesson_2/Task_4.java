import java.io.FileReader;
import java.io.File;

public class Task_4 {
    public static void main(String[] args) {
        int n = 10;
        String text = "TEST";
        File file = new File("Lesson_2\\text.txt");
        try {
            FileReader reader = new FileReader("Lesson_2\\text.txt");
            char[] arr = new char[(int) file.length()];
            reader.read(arr);
            for (char c: arr)
            {
                System.out.print(c);
            }
            reader.close();
        } catch (Exception a) {
            System.out.println("Что-то пошло не так");
        }
    }
}
