import org.example.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FibonacciTest {

    Fib fib;

    @Test
    public void TestFibonacci_WhenRange_1_ThenListResult_NotEmpty() {
        int range = 1;

        fib = new Fib(range);

//        fib.getFibSeries(); // récupérer une liste

        List<Integer> fibs = fib.getFibSeries();

        Assertions.assertFalse(fibs.isEmpty()); // si elle vide, ça renvoie vrai

    }// si elle renvoie faux, elle n'est pas vide

    @Test
    public void TestFibonacci_WhenRange_1_ThenListResult_0() {

        int range = 1;

        fib = new Fib(range);

        List<Integer> fibs = fib.getFibSeries();

        Assertions.assertEquals(0, fibs.get(0));

    }

    @Test
    public void TestFibonacci_WhenRange_6_ThenListResultContains_3() {

        int range = 6;
        fib = new Fib(range);

        List<Integer> fibs = fib.getFibSeries();

        Assertions.assertTrue(fibs.contains(3));
    }

    @Test
    public void TestFibonacci_WhenRange_6_ThenListContains_6_Elements() {
        int range = 6;
        fib = new Fib(range);

        List<Integer> fibs = fib.getFibSeries();

        Assertions.assertEquals(6, fibs.size()); //size va donner directment la taille de la liste

    }

    @Test
    public void TestFibonacci_WhenRange_6_ThenListNoContain_4() {

        int range = 6;
        fib = new Fib(range);

        List<Integer> fibs = fib.getFibSeries();

        Assertions.assertFalse(fibs.contains(4)); //renvoie faux quand il ne contiens pas le 4

    }

    @Test
    public void TestFibonacci_WhenRange_6_ThenListContainCorrectValues() {

        int range = 6;
        fib = new Fib(range);

        List<Integer> fibs = fib.getFibSeries();
        List<Integer> listExpected = Arrays.asList(0, 1, 1, 2, 3, 5);
        Collections.sort(fibs); //permet de mettre les valeurs de la liste dans l'ordre

        Assertions.assertEquals(listExpected, fibs);
    }

    @Test
    public void TestFibonacci_WhenRange_6_ThenListIsSorted() {

        int range = 6;
        fib = new Fib(range);

        List<Integer> fibs = fib.getFibSeries();
        List<Integer> listExpected = new ArrayList<>(fibs); // on fait une copie de la liste rendu par Fibonacci
        Collections.sort(listExpected);//permet de mettre les valeurs de la liste dans l'ordre

        Assertions.assertEquals(listExpected, fibs);

    }
}
