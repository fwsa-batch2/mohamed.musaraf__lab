
public class construc {

    construc() {
        System.out.println("default");
    }

    construc(int x){
        this();
        System.out.println("hiii "+x);
    }

    construc(int x, int y){
        this(x);
        System.out.println(x+y);
    }

    public static void main(String args[]) {
        new construc(9,1);
    }
}
