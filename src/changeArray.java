import java.util.Arrays;

public class changeArray {
    static int[] array = new int[10];
    public static void changeMyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 3; i <= 7; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
