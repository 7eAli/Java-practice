package Lesson_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются
изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить 
на некоторую букву во втором слове, при этом

1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. 
(Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code) n - c, o - o, t-d, e-e

Пример 1:

Input: s = "foo", t = "bar" f- b, o - a, ошибка

Output: false

Пример 2:

Input: s = "paper", t = "title"
p-t
a-i
e-l
r-e
Output: true
 */

public class Task_2 
{
    public static void main(String[] args) 
    {        
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите первое слово: ");
        String str_1 = sc.nextLine();
        System.out.println("Введите второе слово: ");
        String str_2 = sc.nextLine();
        System.out.println(check_str(str_1, str_2));
        sc.close();
    }
    public static boolean check_str(String str_1, String str_2)
    {        
        Map<Character, Character> str_1_map = new HashMap<>();        
        if (str_1.length() != str_2.length())
        {
            return false;
        }
        else
        {            
            for (int i = 0; i < str_1.length(); i++) 
            {
                if(!str_1_map.containsKey(str_1.charAt(i)))
                {
                    str_1_map.put(str_1.charAt(i), str_2.charAt(i));
                }
                else
                {
                    if(str_1_map.get(str_1.charAt(i)) != str_2.charAt(i))
                    {
                        return false;
                    }                    
                }
            }
        }
        return true;
    }    
}
