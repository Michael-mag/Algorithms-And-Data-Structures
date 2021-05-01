package java_algos;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.ParameterizedTest;
import org.junit.jupiter.api.provider.CsvSource;
import org.junit.jupiter.api.Test;

public class TwoNumbersSumTest {
    private TwoNumbersSum tsum;

    //Before each call to the add two numbers class instantiate the object
    @BeforeEach
    public void instantiate(){
        this.tsum = new TwoNumbersSum();
    }

    @Test
    @DisplayName("Testing equal length numbers")
    public void testequalLengthNumbers(){
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        first.add(5);
        first.add(9);
        second.add(1);
        second.add(7);
        sum = tsum.addTwoNumbers(first,second);
        expected.add(7);
        expected.add(6);
        Assertions.assertEquals(expected,sum);
    }

}