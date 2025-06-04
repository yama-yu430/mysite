package curriculum14;

public class ArrayUtils1 {
    public boolean isArrayEmpty(int[] array) {
        return array == null || array.length == 0;
    }

    public static void main(String[] args) {
        ArrayUtils1 utils = new ArrayUtils1();

        int[] array1 = null;
        int[] array2 = {};
        int[] array3 = {1, 2, 3};

        System.out.println("array1 は空？ → " + utils.isArrayEmpty(array1));
        System.out.println("array2 は空？ → " + utils.isArrayEmpty(array2));
        System.out.println("array3 は空？ → " + utils.isArrayEmpty(array3));
    }
}
