import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.learnup.homework.GameLogic;

public class GameLogicTest {

    // Секция numberOfDropOutsTest <- принято сокращение numDrop

    // Секция numDropGreenLight

    @Test
    public void numDropGreenLightSpeedZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedBelowZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр -2", "Василий -5", "Олег -5", "Марьян -1"};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 2", "Василий 3", "Олег 4", "Марьян 55"};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixZerosNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр -2", "Василий -15", "Олег 0", "Марьян -55"};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixZerosPositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 2", "Василий 15", "Олег 0", "Марьян 55"};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixNegativePositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -5", "Петр 2", "Василий -15", "Олег 6", "Марьян 55"};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixNegativePositiveZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -5", "Петр 2", "Василий 0", "Олег 6", "Марьян 55"};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    // Секция numDropRedLight

    @Test
    public void numDropRedLightArrayZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр -5", "Василий -6", "Олег -1", "Марьян -1"};
        int expected = 5; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void numDropRedLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 2", "Василий 3", "Олег 4", "Марьян 5"};
        int expected = 3; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр -2", "Василий 0", "Олег -4", "Марьян -5"};
        int expected = 3; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosPositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 2", "Василий 0", "Олег 4", "Марьян 5"};
        int expected = 2; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixNegativePositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -2", "Петр 2", "Василий -55", "Олег 4", "Марьян 5"};
        int expected = 4; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosPositiveNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 2", "Василий 0", "Олег -4", "Марьян 5"};
        int expected = 2; // ОР
        int actual = GameLogic.numbersOfDropOuts(listOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    // Секция speedOfTheDroppedPlayers <- принято сокращение speedDrop

    // Секция speedDropGreenLight

    @Test
    public void speedDropGreenLightSpeedArraySpeedZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр -52", "Василий -4", "Олег -5", "Марьян -1"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 52", "Василий 4", "Олег 5", "Марьян 1"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр 0", "Василий 0", "Олег -5", "Марьян -1"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosPositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 52", "Василий 0", "Олег 0", "Марьян 1"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayNegativePositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 52", "Василий -4", "Олег -5", "Марьян -1"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosNegativePositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр 0", "Василий 4", "Олег -5", "Марьян 1"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedDropRedLight

    @Test
    public void speedDropRedLightSpeedArrayZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр -5", "Василий -4", "Олег -51", "Марьян -1"};
        int[] expected = {-1, -5,-4,-51,-1}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 13", "Василий 4", "Олег 51", "Марьян 125"};
        int[] expected = {13, 4, 51, 125}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр 0", "Василий 0", "Олег -51", "Марьян -1"};
        int[] expected = {-1, -51, -1}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosPositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 0", "Василий 4", "Олег 51", "Марьян 0"};
        int[] expected = {4, 51}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayPositiveNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 51", "Василий -4", "Олег -51", "Марьян -1"};
        int[] expected = {51, -4, -51, -1}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosNegativePositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр 0", "Василий 2", "Олег 51", "Марьян -1"};
        int[] expected = {-1, 51, -1}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedOfTheNonDroppedPlayers <- принято сокращение speedNonDrop

    // Секция speedNonDropGreenLight

    @Test
    public void speedNonDropGreenLightSpeedArrayZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int[] expected = {0, 0, 0, 0, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр -5", "Василий -85", "Олег -7", "Марьян -75"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 5", "Василий 85", "Олег 7", "Марьян 75"};
        int[] expected = {1, 5, 85, 7, 75}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр -5", "Василий -85", "Олег 0", "Марьян -75"};
        int[] expected = {0, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosPositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 5", "Василий 85", "Олег 0", "Марьян 75"};
        int[] expected = {0, 5, 85, 0, 75}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayPositiveNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -5", "Петр 5", "Василий 85", "Олег -78", "Марьян 75"};
        int[] expected = {5, 85, 75}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosPositiveNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 5", "Василий 0", "Олег -78", "Марьян 75"};
        int[] expected = {0, 5, 0, 75}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedNonDropRedLight

    @Test
    public void speedNonDropRedLightSpeedArrayZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 0", "Василий 0", "Олег 0", "Марьян 0"};
        int[] expected = {0, 0, 0, 0, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван -1", "Петр -5", "Василий -85", "Олег -7", "Марьян -75"};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 1", "Петр 5", "Василий 85", "Олег 7", "Марьян 75"};
        int[] expected = {1}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 0", "Василий -85", "Олег -8", "Марьян -75"};
        int[] expected = {0, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosPositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 2", "Василий 85", "Олег 0", "Марьян 75"};
        int[] expected = {0, 2, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayPositiveNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 5", "Петр 2", "Василий 85", "Олег -78", "Марьян 75"};
        int[] expected = {2}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosPositiveNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Иван 0", "Петр 1", "Василий 0", "Олег -78", "Марьян 75"};
        int[] expected = {0, 1, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(listOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }


    // Секция соответствия массивов имен выживших
    @Test
    public void trueNameTest () {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Петр 1", "Оксана -5", "Валерий 0", "Гавриил 57"};
        String[] expected = {"Петр", "Валерий"};
        String[] actual = GameLogic.listOfSurvivors(listOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneNameTest () {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Петр 1"};
        String[] expected = {"Петр"};
        String[] actual = GameLogic.listOfSurvivors(listOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void nameWithSymbolTest () {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        String[] listOfPlayers = {"Петр! 1", "Илья№ 5"};
        String[] expected = {"Петр!"};
        String[] actual = GameLogic.listOfSurvivors(listOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}
