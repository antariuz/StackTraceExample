public class StackTraceExample {
    public static void main(String[] args) {
        System.out.println(convertStringToInt(null));
    }

    public static int convertStringToInt(String s) {
        int x = Integer.parseInt(s);
        return x;
    }
}
