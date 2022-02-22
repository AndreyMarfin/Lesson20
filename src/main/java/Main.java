import java.sql.SQLOutput;
import java.util.Arrays;

import static pro.learnup.homework.GameLogic.*;

public class Main {
    public static void main(String[] args) {

        String[] listOfPlayers = {"Василий 3", "Петр 1", "Василиса -6"};

        int result1 = numbersOfDropOuts(listOfPlayers);   // <- сколько игроков выбывает?
        System.out.println("Выбывает игроков : " + result1);

        int[] result2 = speedOfTheDroppedPlayers(listOfPlayers);         // <- массив из скоростей выбывающих
        System.out.println("Массив скоростей выбывших игроков : " + Arrays.toString(result2));

        int[] result3 = speedOfTheNonDroppedPlayers(listOfPlayers);        // <- массив из скоростей не выбывающих
        System.out.println("Массив скоростей участников, продолжающих играть : " + Arrays.toString(result3));

        String[] result4 = listOfSurvivors(listOfPlayers);
        System.out.println("Имена выживших игроков : " + Arrays.toString(result4));

    }
}