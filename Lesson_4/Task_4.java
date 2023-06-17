package Lesson_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * Написать метод, который принимает массив элементов,
 * помещает их в очередь и выводит в консоль содержимое очереди
 */

public class Task_4 
{
    public static void main(String[] args) 
    {
        Random rd = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = rd.nextInt(10);
            System.out.println(numbers[i]);
        }
        System.out.println(show(numbers));
    }
    public static Queue<Integer> show(int[] nums)
    {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) 
        {
            q.add(nums[i]);
        }
        return q;
    }
}
