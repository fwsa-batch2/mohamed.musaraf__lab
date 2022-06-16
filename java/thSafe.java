public class thSafe {
    private static thSafe instance;

    thSafe() {
        System.out.println("hello");
    }

    synchronized static thSafe getThread() {
        if (instance == null) {
            new thSafe();
        }
        return null;
    }

    public static void main(String[] args) {
        getThread();
    }
}
