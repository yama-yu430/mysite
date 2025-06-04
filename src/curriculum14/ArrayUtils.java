package curriculum14;

public class ArrayUtils {
    public int findMin(int[] array){
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();

        int[] numbers = {42, 17, 8, 99, 23, 5, 71};

        int min = utils.findMin(numbers);
        System.out.println("最小値: " + min);
    }
}
