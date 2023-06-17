package Lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.
 */

public class Task_1 
{
    public static void main(String[] args) 
    {                
        ArrayList<Integer> numbers_al = new ArrayList<>();
        long time_start_al = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
        {
            numbers_al.add(0, 0);
        }
        long time_end_al = System.currentTimeMillis();
        long time_passed_al = time_end_al - time_start_al;
        System.out.println(time_passed_al);
        LinkedList<Integer> numbers_ll = new LinkedList<>();
        long time_start_ll = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) 
        {
            numbers_ll.add(0, 0);
        }
        long time_end_ll = System.currentTimeMillis();
        long time_passed_ll = time_end_ll - time_start_ll;
        System.out.println(time_passed_ll);
    }    
}
