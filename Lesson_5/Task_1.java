package Lesson_5;

import java.util.HashMap;
import java.util.Map;

/*
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

123456 Иванов

321456 Васильев

234561 Петрова

234432 Иванов

654321 Петрова

345678 Иванов

Вывести данные по сотрудникам с фамилией Иванов.
 */

public class Task_1 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(123456,"Иванов");
        employees.put(321456,"Васильев");
        employees.put(234561,"Петрова");
        employees.put(234432,"Иванов");
        employees.put(654321,"Петрова");
        employees.put(345678,"Иванов");
        for (var item : employees.entrySet())
        {
            if (item.getValue().equals("Иванов"))
            {
                System.out.println(item);
            }
        }
    }
}
