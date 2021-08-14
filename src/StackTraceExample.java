public class StackTraceExample {
    public static void main(String[] args) throws MyException {
        System.out.println(convertStringToInt("null"));
    }

    public static int convertStringToInt(String s) throws MyException {
        if (s.equals("")) throw new MyException("MyException message");
        return Integer.parseInt(s);
    }
}
