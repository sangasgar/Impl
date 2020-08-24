public class MyArraySizeException extends Exception {
    String numArray;

    public MyArraySizeException(String numArray) {
        this.numArray = numArray;
    }

    public MyArraySizeException() {
        System.out.println("Данный массив не 4 на 4");
    }
}