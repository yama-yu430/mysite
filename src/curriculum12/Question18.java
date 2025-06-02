package curriculum12;

public class Question18 {
    public static void main(String[] args) {
        String[][] inputArray = {
                {"test@example.com", "123"},
                {"user@domain.com", "not-email"},
                {"admin@company.com", "example"}
        };

        String regex = "^[A-Za-z0-9._$+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

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

        System.out.println("有効なメールアドレスの新しい配列:");
        for (String[] row : resultList) {
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}


