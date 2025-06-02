package curriculum12;

public class Question17 {
    public static void main(String[] args) {
        String[][] inputArray = {
                {"123", "abc"},
                {"456", "789"},
                {"12a", "345"}
        };
        String regex = "^\\d*$";

        java.util.List<String[]> resultList = new java.util.ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            java.util.List<String> validRow = new java.util.ArrayList<>();
            for (int j = 0; j < inputArray[i].length; j++) {
                if (inputArray[i][j].matches(regex)) {
                    validRow.add(inputArray[i][j]);
                }
            }
            if (!validRow.isEmpty()) {
                resultList.add(validRow.toArray(new String[0]));
            }
        }

        System.out.println("数字のみで構成された要素の新しい配列:");
        for (String[] row : resultList) {
            for (String value : row) {
                System.out.println(value + " ");
            }
            System.out.println();
        }
    }
}
