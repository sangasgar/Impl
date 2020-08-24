public class MyArrayDataException  extends Exception {
    String s;

    public MyArrayDataException(String s) {
        this.s = s;
    }

    public MyArrayDataException() {
        System.out.println("Значение не может быть преобразовано в Int");
    }
}

