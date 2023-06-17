package Lesson_4;

import java.util.Scanner;
import java.util.Stack;

/*
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и "запоминает" строки
 * 2. Если введено print, выводит строки так, чтобы последняя введенная
 *    была первой в выводе, а первая введённая - последней в выводе и чистит структуру
 * 3. Выход - exit
 */

public class Task_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> text = new Stack<>();
        String str = "";
        while (!str.equals("exit")) 
        {
            str = sc.nextLine();
            if (str.equals("print"))
            {
                while(!text.empty())
                {
                    System.out.print(text.pop());
                    System.out.print(" ");
                }
                System.out.println();
            }
            else
            {
                text.push(str);
            }
            System.out.println(text);
        }
    }    
}
