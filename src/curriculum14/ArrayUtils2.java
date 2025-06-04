package curriculum14;

public class ArrayUtils2 {
    public boolean containsNumber(int[] array, int num) {
        for (int n : array) {
            if (n == num) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayUtils2 utils = new ArrayUtils2();

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(utils.containsNumber(nums, 3));
        System.out.println(utils.containsNumber(nums, 6));
        System.out.println(utils.containsNumber(nums, 1));
    }
}
