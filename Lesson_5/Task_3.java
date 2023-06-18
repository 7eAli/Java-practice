package Lesson_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/* Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь */

public class Task_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in, "cp866");
        String expression = sc.nextLine();
        System.out.println(check_expression(expression));
    }
    public static boolean check_expression(String expression)
    {
        Map<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put(')', '(');
        parenthesis.put(']', '[');
        parenthesis.put('}', '{');
        parenthesis.put('>', '<');
        Stack<Character> par_seq = new Stack<>();
        for (int i = 0; i < expression.length(); i++) 
        {
            if (parenthesis.containsValue(expression.charAt(i)))
            {
                par_seq.push(expression.charAt(i));
            }
            if (parenthesis.containsKey(expression.charAt(i)))
            {
                if (par_seq.empty() || par_seq.pop() != parenthesis.get(expression.charAt(i)))
                {
                    return false;
                }
            }
        }        
        return par_seq.empty();
    }
}
