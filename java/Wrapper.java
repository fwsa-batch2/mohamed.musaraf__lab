public class Wrapper {
    public static void main(String[] args) {
       int num = 5;
       Character word = 'm';
       Integer myObj = Integer.valueOf(num);
        System.out.println(myObj);

        Character obj = new Character(word);
        char charWord = obj;
        System.out.println(charWord);
    }
}

