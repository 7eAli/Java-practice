package Lesson_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями
 * Вывести название каждой планеты и кол-во их повторений в списке
 */
public class Task_1 {
    public static void main(String[] args) 
    {
        String[] planets = new String[] {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        List<String> random_planets = new ArrayList<>();
        List<String> planets_repeats = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 50; i++) 
        {
            random_planets.add(planets[rd.nextInt(7)]);
        }
        int count = 0;
        for (int i = 0; i < random_planets.size(); i++)
        {            
            if (!planets_repeats.contains(random_planets.get(i)))
            {
                planets_repeats.add(random_planets.get(i));
                for (int j = 0; j < random_planets.size(); j++) 
                {
                    if (random_planets.get(i) == random_planets.get(j))
                    {
                        count += 1;
                        planets_repeats.add(random_planets.get(i));
                    }
                }
                System.out.printf("%s - %d\n", random_planets.get(i), count);
                count = 0;
            }            
        }
        System.out.println(random_planets);

    }
}
