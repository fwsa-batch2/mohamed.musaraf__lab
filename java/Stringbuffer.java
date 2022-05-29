public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer stringPractice = new StringBuffer("Musaraf");
        System.out.println(stringPractice);
        stringPractice.append(" Don");
        System.out.println(stringPractice);

        stringPractice.replace(4,7,"RAF");
        System.out.println(stringPractice);
    }
}