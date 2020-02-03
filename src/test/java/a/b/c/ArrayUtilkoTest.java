package a.b.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilkoTest {

    @Test
    void sort() {
        int[] src = new int[]{9,8,7,6,5,4,3,2,1};
        ArrayUtilko.sort(src);
        assertTrue(src[7] > src[5]);
        assertTrue(src[5] > src[3]);
        assertTrue(src[3] > src[1]);
        assertTrue(src[1] > src[0]);
    }
}