package Lesson_1;

import javax.xml.transform.Source;

/*
 * Дан массив nums = [3, 2, 2, 3, 4, 2, 3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */

public class Task_3 
{    
    public static void main(String[] args) 
    {
        int[] nums = new int[] {3, 2, 2, 3, 4, 2, 3};
        int value = 3;
        int count = 0;       
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] != value)
            {
                nums[count] = nums[i];
                count++;
            }
        }        
        for (int j = count; j < nums.length; j++)
        {
        nums[j] = value;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]);
        }        
    }
}
