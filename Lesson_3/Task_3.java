package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * Создать список типа ArrayList.
 * Поместить в него как строки, так и целые числа. 
 * Пройти по списку, найти и удалить целые числа.
 */
public class Task_3 
{
        public static void main(String[] args) 
    {
        ArrayList<Object> something = new ArrayList<>(Arrays.asList("ksh", 45, "hh", "bb", 543, 12));
        System.out.println(something);        
        // for (int i = 0; i < something.size(); i++) 
        // {
        //     if(something.get(i) instanceof Integer)
        //     {
        //         something.remove(i);
        //         i--;
        //     }
        // }
        Iterator<Object> iter = something.iterator();
        while (iter.hasNext()) 
        {
            if(iter.next() instanceof Integer)
            {
                iter.remove();
            }
        }
        System.out.println(something);
    }
}
