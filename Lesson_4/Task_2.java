package Lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 1. Принимает от пользователя строку вида
 * text
 * 1. Нужно сохранить text в связный список.
 * 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 * 3. Выход - слово exit
 */

public class Task_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> text = new LinkedList<>();                
        String str = "";
        while (!str.equals("exit"))
        {
            str = sc.nextLine();
            if (str.startsWith("print~"))
            {
                String[] delete = str.split("~");
                System.out.println(text.get(Integer.parseInt(delete[1])));                                
            }
            else
            {
                text.add(str);
            }
            System.out.println(text);
        }        
    }    
}
