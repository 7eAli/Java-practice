import java.util.Scanner;

/*
 * Задача 1. Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, 
 * которая состоит из чередующихся символов c1 и c2, начиная с c2.
 */

public class Task_1 
{
    public static void main(String[] args) 
    {
        System.out.println("Введите первый символ: ");        
        String c1 = input_symbol();
        System.out.println("Введите второй символ: ");
        String c2 = input_symbol();
        System.out.println("Введите нечетное число: ");
        int N = input_number();
        String combine = combination(N, c1, c2);
        System.out.println(combine);
    }
    public static String combination(int N, String c1, String c2)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= N/2 - 1; i++) 
        {       
            result.append(c1 + c2);
        }
        return result.toString();
    }
    public static int input_number()
    {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        return result;
    }
    public static String input_symbol()
    {
        Scanner sc = new Scanner(System.in, "cp866");
        String result = sc.nextLine();
        return result;
    }
}