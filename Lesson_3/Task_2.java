package Lesson_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.List;

/*
 * Заполнить список десятью случайными числами
 * Отсортировать список методом sort() и вывести на экран
 */
public class Task_2 {
    public static void main(String[] args) 
    {
        Random rd = new Random();
        List<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) 
        {
            numbers.add(rd.nextInt(10));
        }
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }
}
