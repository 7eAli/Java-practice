import java.util.Scanner;
/*
 * Напишите метод, который сжимает строку.
 * Пример: вход aaaabbbcddaa
 * Ответ: резульат - a4b3cd2a2
 */


public class Task_2
{
    public static void main(String[] args)
    {
        String text = input_symbol();
        text = ZipString(text);
        System.out.println(text);
    }
    public static String input_symbol()
    {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите текст: ");
        String result = sc.nextLine();
        return result;
    }
    public static String ZipString(String str)
    {
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) 
        {
            if (str.charAt(i - 1) == str.charAt(i))
            {
                count += 1;
            }
            else
            {
                if (count != 1)
                {
                    result.append(""+"{"+count+"}");
                    count = 1;
                    result.append(str.charAt(i));
                }
                else
                {
                    result.append(str.charAt(i));
                }
            }
        }
        if (count != 1)
        {
            result.append(""+"{"+count+"}");
        }
        return result.toString();
    }
}
