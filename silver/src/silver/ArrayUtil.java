package silver;
public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        System.out.println("Max value: " + findMax(numbers));
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
        	if (array[i] > max) {
        		max = array[i];
        	}
        }
        return max;
    }
}
