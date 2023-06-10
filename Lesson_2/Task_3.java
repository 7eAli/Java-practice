import java.io.FileWriter;

/*
 * Записать слово TEST в файл 10 раз
 */

public class Task_3 
{
    public static void main(String[] args) 
    {
        int n = 10;
        String text = "TEST";
        try
        {
        FileWriter writer = new FileWriter("Lesson_2\\text.txt", false);
        for (int i = 0; i < n; i++) 
        {
            writer.write(text);
            writer.write("\n");
        }
        System.out.println("Получилось");
        writer.close();
        }
        catch(Exception a)
        {
            System.out.println("Что-то пошло не так");
        }        
    }
}
