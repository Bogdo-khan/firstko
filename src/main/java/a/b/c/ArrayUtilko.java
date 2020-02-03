package a.b.c;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class ArrayUtilko {

    public static void sort(int[] src) {
        for (int i = 0; i < src.length - 1; i++) {
            for (int j = i + 1; j < src.length; j++) {
                if (src[j] < src[i]) {
                    int temp = src[j];
                    src[j] = src[i];
                    src[i] = temp;
                }
            }
        }
    }

    public static void print(String prefix, int[] src) {
        //TODO fuck somebody
        String result = StringUtils.join(ArrayUtils.toObject(src), ", ");
        System.out.println(prefix + result);
    }
}
