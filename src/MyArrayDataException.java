public class MyArrayDataException  extends Exception {
    String s;

    public MyArrayDataException(String s) {
        this.s = s;
    }

    public MyArrayDataException() {
        System.out.println("Данное значение не может быть преобразовано в Int");
    }
}
