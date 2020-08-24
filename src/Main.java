import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] numArr = new String[4][4];

        String[][]  numArr1 = new  String[][]{
                {"25", "14", "52", "1234"},
                {"12", "14", "15", "1234"},
                {"12", "14", "15", "521"},
                {"12", "14", "15", "521"}
        };

      numArr = new  String[][]{
              {"12", "14", "15", "1234","265","12", "14", "15", "1234",},
              {"12", "14", "15", "1234","44545","89561"},
              {"12", "14", "15", "521"},
              {"12", "14", "15", "521","56324"}
      };
        arrayCheck(numArr1);

    }
    public static void arrayCheck (String[][] arrayNum) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i].length != arrayNum.length){
                throw new MyArraySizeException();
            } else {

            }
        }
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < arrayNum[i].length; j++) {
                int n;

                try {
                    Integer.parseInt(arrayNum[i][j]);
                }
               catch (Exception e) {
                   throw new MyArrayDataException();
               }
                    n = Integer.parseInt(arrayNum[i][j]);
                sum = sum + n;
                System.out.print(arrayNum[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.println("Массив 4 на 4");
        System.out.println("Массив успешно, может быть преобразовано в INT");
        System.out.println("Сумма всего массива " + sum);
    }
}
