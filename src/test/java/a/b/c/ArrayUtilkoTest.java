package a.b.c;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.function.IntUnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilkoTest {

    private Random random = new Random();

    @Test
    void shouldBeSorted() {
        int[] src = generate(random.nextInt(1000), i-> random.nextInt(1000));
        ArrayUtilko.print("Before ", src);
        assertFalse(arrayIsSorted(src));
        ArrayUtilko.sort(src);
        ArrayUtilko.print("After", src);
        assertTrue(arrayIsSorted(src));
    }

    @Test
    void shouldBeSorted1() {
        int[] src = generate(-1000+random.nextInt(100), i-> i+random.nextInt(150));
        ArrayUtilko.print("Before ", src);
        assertTrue(arrayIsSorted(src));
        ArrayUtilko.sort(src);
        ArrayUtilko.print("After", src);
        assertTrue(arrayIsSorted(src));
    }

    @Test
    void shouldBeSorted2() {
        int[] src = generate(1000-random.nextInt(100), i-> i-random.nextInt(100));
        ArrayUtilko.print("Before ", src);
        assertFalse(arrayIsSorted(src));
        ArrayUtilko.sort(src);
        ArrayUtilko.print("After", src);
        assertTrue(arrayIsSorted(src));
    }

    @Test
    void shouldBeSorted3() {
        int c = random.nextInt(1000) - 500;
        int[] src = generate(c, i-> c);
        ArrayUtilko.print("Before ", src);
        assertTrue(arrayIsSorted(src));
        ArrayUtilko.sort(src);
        ArrayUtilko.print("After", src);
        assertTrue(arrayIsSorted(src));
    }

    private int[] generate(int initial, IntUnaryOperator generator) {
        int[] result = new int[25];
        result[0] = initial;
        for(int i =1; i < result.length; i++){
            result[i] = generator.applyAsInt(result[i-1]);
        }
        return result;
    }

    private boolean arrayIsSorted(int[] arr){
        for(int i=0; i < arr.length-1; i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}